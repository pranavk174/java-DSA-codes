package javabasics.dynamicprogramming;

public class floyedwarshal {
    public static void floyedwarsh(int[][] graph){
        int n = graph.length;
        int i,j,k;
        //traversing logic
        for(k=0;k<n;k++){       //via node loop  :matlb iss node ke through jaane ka rasta
            for(i=0;i<n;i++){       //source node loop
                for(j=0;j<n;j++){       //destination node loop
                    graph[i][j] = Math.min(graph[i][j],graph[i][k]+ graph[k][j]);
                }
            }
        }
    }
    public static void main(String[] args){
    final int inf= 1000000;
    int[][] graph=  {
            {0,4,inf,5,inf},
            {inf ,0,1,inf,6},
            {2,inf,0,3,inf},
            {inf ,inf,1,0,2},
            {1,inf,inf,4,0}};
        int n= graph.length;
    floyedwarsh(graph);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j] == inf)
                    System.out.print("inf ");
                else
                    System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}



