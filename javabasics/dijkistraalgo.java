package javabasics;
import java.util.*;
public class dijkistraalgo {
    public static class edge{
        int src;
        int dest;
        int wt;

        public edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i=0; i<graph.length;i++){
            graph[i]= new ArrayList<edge>();
        }

        graph[0].add(new edge(0,1,4));
        graph[0].add(new edge(0,7,8));

        graph[1].add(new edge(1,2,8));
        graph[1].add(new edge(1,7,11));

        graph[2].add(new edge(2,1,8));
        graph[2].add(new edge(2,8,2));
        graph[2].add(new edge(2,3,7));
        graph[2].add(new edge(2,5,4));

        graph[3].add(new edge(3,2,7));
        graph[3].add(new edge(3,5,14));
        graph[3].add(new edge(3,4,9));


        graph[4].add(new edge(4,3,9));
        graph[4].add(new edge(4,5,10));

        graph[5].add(new edge(5,4,10));
        graph[5].add(new edge(5,3,14));
        graph[5].add(new edge(5,2,4));
        graph[5].add(new edge(5,6,2));

        graph[6].add(new edge(6,5,2));
        graph[6].add(new edge(6,8,6));
        graph[6].add(new edge(6,7,1));


        graph[7].add(new edge(7,0,8));
        graph[7].add(new edge(7,6,1));
        graph[7].add(new edge(7,1,11));
        graph[7].add(new edge(7,8,7));

        graph[8].add(new edge(8,2,2));
        graph[8].add(new edge(8,6,6));
        graph[8].add(new edge(8,7,7));

//        graph[0].add(new edge(0,1,2));
//        graph[0].add(new edge(0,2,4));
//        graph[1].add(new edge(1,2,-4));
//        graph[2].add(new edge(2,3,3));
//        graph[3].add(new edge(3,4,4));
//        graph[4].add(new edge(4,1,-1));


    }
    public static class pair implements Comparable<pair> {          //comparison on basis of distance
        int node;
        int dest;

        public pair(int n,int d){
            this.node=n;
            this.dest=d;
        }

        @Override
        public int compareTo(pair p2) {

            return this.dest-p2.dest;
        }
    }




    public static void dijkistra(ArrayList<edge> graph[], int src, int V){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        boolean vis[]=new boolean[V];
        int dest[] = new int[V];
        pq.add(new pair(src,0));
        for(int i =0;i<V;i++){
            if(i != src){
                dest[i] = Integer.MAX_VALUE;
            }
        }

        while(!pq.isEmpty()){
            pair curr= pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
            }
            for(int i=0;i<graph[curr.node].size();i++){
                edge e = graph[curr.node].get(i);
                int x= e.src;
                int y=e.dest;
                if(dest[x] + e.wt < dest[y] ){
                    dest[y] = dest[x] + e.wt;
                    pq.add(new pair(y,dest[y]));
                }
            }
        }
        for(int i = 0;i<V;i++){
            System.out.print(dest[i]+ " " );
        }
    }
    public static void main(String args[]) {
        int v = 9;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);

        dijkistra(graph, 0, v);
    }
}
