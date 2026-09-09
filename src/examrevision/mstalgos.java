package examrevision;


import javabasics.mstalgo;

import java.util.*;


public class mstalgos {
    public static class edge {
        int s;
        int d;
        int wt;


        public edge(int s, int d, int wt) {
            this.s = s;
            this.d = d;
            this.wt = wt;
        }
    }

    public static void creategraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));

        graph[1].add(new edge(1, 3, 7));
        graph[1].add(new edge(1, 2, 1));

        graph[2].add(new edge(2, 4, 3));

        graph[3].add(new edge(3, 5, 1));

        graph[4].add(new edge(4, 3, 2));
        graph[4].add(new edge(4, 5, 5));


    }

    public static class pair implements Comparable<pair> {
        int v;
        int cost;

        public pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        public int compareTo(pair p2) {
            return this.cost - p2.cost;
        }
    }

   public static void prims(ArrayList<edge> graph[],int src,int v){     //bfs
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int finalcost = 0;
        boolean vis[] = new boolean[v];

        pq.add(new pair(src,0));
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]= true;
                finalcost+=curr.cost;
                for(int i =0;i<graph[curr.v].size();i++){
                    edge e = graph[curr.v].get(i);
                    if(!vis[e.d]){
                        pq.add(new pair(e.d,e.wt));
                    }
                }
            }
        }
       System.out.println("the final mst is "+finalcost);
   }

    public static void dijkistra(ArrayList<edge> graph[],int src,int v){    //bfs
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int dist[] = new int[v];
        boolean vis[]= new boolean[v];

        for(int i=0;i<v;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        pq.add(new pair (src,0));
        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                for(int i =0;i<graph[curr.v].size();i++){
                    edge e= graph[curr.v].get(i);
                    int x = e.s;
                    int y = e.d;
                    if(dist[x] + e.wt < dist[y]){
                        dist[y] = dist[x]+ e.wt;
                        pq.add(new pair(y,dist[y]));
                    }
                }
            }
        }
        for(int i=0;i<v;i++){
            System.out.print(dist[i]+"/");
        }
   }


    public static void main(String args[]) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        prims(graph, 0, v);
        dijkistra(graph, 0, v);
    }
}
