package javabasics;
import java.util.*;
public class topologicalsort {
    public static class edge{
        int s;
        int d;

        public edge(int s,int d){
            this.s=s;
            this.d=d;

        }
    }

    public static void creategraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length ; i++){
            graph[i]= new ArrayList<edge>();
        }
        //acyclic directed graph

//             5        4
//            |  \   /  |
//            |    0    |
//            |         |
//             2        1
//              \      /
//                 3
        graph[2].add(new edge(2,3));

        graph[3].add(new edge(3,1));

        graph[4].add(new edge(4,0));
        graph[4].add(new edge(4,1));

        graph[5].add(new edge(5,0));
        graph[5].add(new edge(5,2));

    }
        public static void topsortUtil(ArrayList<edge> graph[],boolean[] vis,int curr,Stack<Integer> st){
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){

           edge e = graph[curr].get(i);
            if(!vis[e.d])
                topsortUtil(graph,vis,e.d,st);
        }

        st.add(curr);
}

   public static void topsort(ArrayList<edge> graph[],int v){
        Stack<Integer> st = new Stack<>();
        boolean[] vis= new boolean[v];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topsortUtil(graph,vis,i,st);
            }
        }
        while(!st.isEmpty()){
            System.out.println(st.pop()+ " /");
        }
   }
    public static void main(String args[]){
        int v=6;
        ArrayList<edge> graph[]= new ArrayList[v];
        creategraph(graph);
        topsort(graph,v);
    }
}
