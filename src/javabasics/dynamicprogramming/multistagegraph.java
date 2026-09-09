//package javabasics.dynamicprogramming;
//
//public class multistagegraph {
//    public static void multigraph(int[][] c,int n){
//        int stages = 4;
//        int[] cost = new int[n+1];
//        int[] dist = new int[n+1];
//        int[] path=new int[stages];
//
//
//        cost[n] = 0;
//        for(int i= n-1;i>=1;i--){
//            int min = 2234343;
//            for(int k = i+1;k<n;k++){
//                if(c[i][k] !=0 && c[i][k]<min){
//                    min = c[i][k] +cost[k];
//                    dist[i] = k;
//                }
//            }
//            cost[i] = min;
//        }
//        path[1] =1;
//        path[stages]=n;
//        int result=0;
//        for(int i =2;i<stages;i++){
//            path[i] = dist[path[i-1]];
//        }
//        for(int i=0;i<stages;i++){
//            result+=path[i];
//        }
//        System.out.println("final result is "+ result);
//
//    }
//    public static void main(String[] args) {
//        int INF = 577467;
//        int n = 8;
//        int[][] graph = new int[][] {
//                { INF, 1, 2, 5, INF, INF, INF, INF },
//                { INF, INF, INF, INF, 4, 11, INF, INF },
//                { INF, INF, INF, INF, 9, 5, 16, INF },
//                { INF, INF, INF, INF, INF, INF, 2, INF },
//                { INF, INF, INF, INF, INF, INF, INF, 18 },
//                { INF, INF, INF, INF, INF, INF, INF, 13 },
//                { INF, INF, INF, INF, INF, INF, INF, 2 }
//        };
//
//        multigraph(graph,n);
//
//
//    }
//
//}


package javabasics.dynamicprogramming;

public class multistagegraph {
    public static int multigraph(int[][] graph, int stages) {
        int n = graph.length;
        int[] cost = new int[n];
        int[] path = new int[stages];

        for (int i = 0; i < n; i++) {
            cost[i] = Integer.MAX_VALUE;
        }
        cost[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (graph[i][j]!= 0 && graph[i][j] < cost[i]) {
                    cost[i] = graph[i][j];
                    path[i] = j;
                }
            }
        }

        path[0] = 0;
        int result = 0;
        for (int i = 1; i < stages; i++) {
            path[i] = path[path[i - 1]];
            result += path[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE;
        int n = 8;
        int[][] graph = new int[][] {
                { INF, 1, 2, 5, INF, INF, INF, INF },
                { INF, INF, INF, INF, 4, 11, INF, INF },
                { INF, INF, INF, INF, 9, 5, 16, INF },
                { INF, INF, INF, INF, INF, INF, 2, INF },
                { INF, INF, INF, INF, INF, INF, INF, 18 },
                { INF, INF, INF, INF, INF, INF, INF, 13 },
                { INF, INF, INF, INF, INF, INF, INF, 2 }
        };

        int result = multigraph(graph, 4);
        System.out.println("final result is " + result);
    }
}