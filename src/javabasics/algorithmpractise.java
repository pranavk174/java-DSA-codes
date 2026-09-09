package javabasics;
import java.util.*;
public class algorithmpractise {
    public static class edge{
        int src,dest,wt;

//        public edge(int s,int d,int w)
        public edge(int s,int d)
        {
            this.src=s;
            this.dest=d;
//            this.wt=w;
        }
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
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
    public static void topsortUtil(ArrayList<edge> graph[],boolean vis[],int curr,Stack<Integer> stack){
        vis[curr] = true;
        for(int i=0 ;i < graph[curr].size();i++){   // adding neighbour nodes
            edge e= graph[curr].get(i);
            if(!vis[e.dest])
                topsortUtil(graph,vis,e.dest,stack);

        }
        stack.push(curr);
    }
    public  static void topsort(ArrayList<edge> graph[],int v){
        boolean vis[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for(int i= 0;i<v;i++){
            if(!vis[i])
                topsortUtil(graph,vis,i,stack);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+ " ");
        }

    }

        public static void main(String args[]){
        int v= 6;
        ArrayList<edge> graph[]=new ArrayList[v];
        creategraph(graph);
        topsort(graph,v);
        }
}
