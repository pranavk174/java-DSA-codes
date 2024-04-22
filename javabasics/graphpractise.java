package javabasics;
import java.util.*;
public class graphpractise {
    public static class edge{
        int s;
        int d;

        public edge(int s,int d){
            this.s=s;
            this.d=d;

        }
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();

        }
//        no cyclic undirected graph nodes
//
//       1 -- 3
//     /      |  \
//    0       |    5 - 6
//     \      |  /
//       2 -- 4
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,4));

        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,4));
        graph[3].add(new edge(3,5));

        graph[4].add(new edge(4,2));
        graph[4].add(new edge(4,3));
        graph[4].add(new edge(4,5));

        graph[5].add(new edge(5,3));
        graph[5].add(new edge(5,4));
        graph[5].add(new edge(5,6));

        graph[6].add(new edge(6,5));





// cylclic graph nodes

//        1 -->0
//             |  ^\
//             |   3
//             |  /^
//             2
//        graph[1].add(new edge(1,0));
//        graph[0].add(new edge(0,2));
//        graph[2].add(new edge(2,3));
//        graph[3].add(new edge(3,0));
    }
//
//    public static boolean isEmpty(){
//        return false;
//    }

    public static void bfs(ArrayList<edge> graph[],int v){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[v];
        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
            System.out.print(curr+" ");
            vis[curr] = true;
            for(int i=0;i<graph[curr].size();i++){
                edge e = graph[curr].get(i);
                q.add(e.d);
            }

            }

        }
    }

    public static boolean cyclicgraph(ArrayList<edge> graph[],boolean vis[],int curr,boolean rec[]){  // time complexity big O(E + B)
        vis[curr] = true;
        rec[curr]= true;
        for(int i=0;i< graph[curr].size();i++){
            edge e= graph[curr].get(i);
            if(rec[e.d]== true){    //cycle logic
                return true;
            }
            else if (!vis[e.d]) {
                if(cyclicgraph(graph,vis,e.d,rec))
                    return true;
            }
        }
            rec[curr] = false;

        return false;
    }
    public static void dfs(ArrayList<edge> graph[],int curr,boolean vis[]){
        System.out.println(curr);
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if (vis[curr] == false)
                dfs(graph,e.d,vis);
        }

    }

    public static void topsortUtil(ArrayList<edge> graph[],boolean vis[],int curr,Stack<Integer> stack){
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);

            if(!vis[e.d]){
                topsortUtil(graph,vis,e.d,stack);
            }
        }
        stack.push(curr);

    }
    public static void topsorting(ArrayList<edge> graph[],int v){
        boolean vis[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<v;i++){
            if(!vis[i])
                topsortUtil(graph,vis,i,stack);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+ " ");
        }
    }

    public static void main(String args[]){
        int v=7;
        ArrayList<edge> graph[] = new  ArrayList[v];
        creategraph(graph);
//        for(int i=0;i<graph[6].size();i++){
//            edge e = graph[4].get(i);
//            System.out.print(e.s+ " and "+ e.d);
//        }
//        boolean vis[] = new boolean[v];
//        for(int i = 0;i<v;i++) {
//           if (vis[i] == false) {
//               bfs(graph, v);
//               dfs(graph, 0, vis);
//           }
//        }



      topsorting(graph,v);
        System.out.print(cyclicgraph(graph,new boolean[v],0,new boolean[v]));

    }
}
