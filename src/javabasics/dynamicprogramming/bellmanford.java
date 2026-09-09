package javabasics.dynamicprogramming;
import java.sql.SQLOutput;
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
        graph[2].add(new edge(2,3,2));
        graph[3].add(new edge(3,4,4));
        graph[4].add(new edge(4,1,-1));


    }
    public static void belford(ArrayList<edge> graph[],int src){

        int v = graph.length;
        int arr[]= new int[v];
        for(int i = 0;i<arr.length;i++){
            if(i != src)
                 arr[i] = Integer.MAX_VALUE;
        }


        for(int i=0;i<v-1 ;i++){
            for(int j= 0 ;j<v;j++){
                for(int k = 0;k<graph[j].size();k++){
                    edge e = graph[j].get(k);

                    int s =e.s;
                    int d = e.d;
                    int w = e.wt;
                    if(arr[s] != Integer.MAX_VALUE && arr[s] + w < arr[d]  ){
                        arr[d] = arr[s] + w;
                    }
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" -> ");
        }



    }

    public static void main(String[] args){
        int V = 5;
        ArrayList<edge> graph[] = new ArrayList[V];
        addgraph(graph);
        belford(graph,0);
    }

}
