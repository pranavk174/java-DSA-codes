package javabasics;
import java.util.*;

import static javabasics.stack.Stack.isEmpty;

public class graphDSA {
//    storing in adjacency list

     static class edge{
        int  s;                           //source;
        int d ;             //destination;
//         int wt;          //weight;

        public edge(int s,int d){
            this.d=d;
            this.s=s;

        }
    }

    public static void createGraph(ArrayList<edge>[] graph){

        for(int i = 0;i <graph.length; i++){
            graph[i]= new ArrayList<edge>();    //storing arraylist in the index of array
        }

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
    }
    public static void bfs(ArrayList<edge> graph[],int v){
         Queue<Integer> q = new LinkedList<>();
         boolean vis[] = new boolean[v];
         q.add(0);  //giving starting value

         while(!q.isEmpty()){
             int curr = q.remove();
             if(!vis[curr]){
                 System.out.println(curr+" ");
                 vis[curr] = true;

                 for(int i=0 ;i< graph[curr].size();i++){
                     edge e = graph[curr].get(i);
                     q.add(e.d);
                 }
             }


         }
    }

    public static void dfs(ArrayList<edge> graph[],int curr,boolean vis[]){

         System.out.print(curr+" ");
         vis[curr]= true;
         for(int i=0;i<graph[curr].size();i++){
             edge e= graph[curr].get(i);
             if(!vis[e.d])
                dfs(graph,e.d,vis);

         }

    }
    public static void main(String[] args){
        int v = 7;


        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
//        for(int i = 0 ; i <= graph[3].size();i++){
//    edge e = graph[2].get(i);   //print 2s neighbour
//    System.out.println(i+1 + " neighbour is " + e.d+" and "+e.wt);
//}
        boolean vis[] = new boolean[v];
//        bfs(graph,v);
        dfs(graph,0,vis);
    }
}


