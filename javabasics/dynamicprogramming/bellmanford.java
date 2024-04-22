package javabasics.dynamicprogramming;
import java.util.*;
public class bellmanford {
    public static class edge{
        int s , d,wt;

        public edge(int s,int d,int wt){
            this.s=s;
            this.d=d;
            this.wt=wt;
        }
    }
    public static void addgraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0,1,2));
        graph[0].add(new edge(0,2,4));
        graph[1].add(new edge(1,2,-4));
        graph[2].add(new edge(2,3,3));
        graph[3].add(new edge(3,4,4));
        graph[4].add(new edge(4,1,-1));


    }
    public static void belford(ArrayList<edge> graph[],int v,int src){
        PriorityQueue<edge> pq = new PriorityQueue();
        boolean vis[] = new boolean[v];
        int arr[]= new int[v];

        for(int i = 0;i<v;i++){
            if(arr[i] != src)
            arr[i] = Integer.MAX_VALUE;
        }



    }

}
