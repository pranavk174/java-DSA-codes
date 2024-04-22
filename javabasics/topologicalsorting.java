//package javabasics;
//import java.util.*;
//
//import static javax.print.attribute.standard.MediaSizeName.A;
//import static javax.print.attribute.standard.MediaSizeName.C;
//
//public class topologicalsorting {
//
//        public static class edge{
//            char s;
//            char d;
//
//            public edge(int s,int d){
//                this.s=s;
//                this.d=d;
//
//            }
//        }
//
//        public static void creategraph(ArrayList<edge> graph[]){
//            for(int i=0;i<graph.length ; i++){
//                graph[i]= new ArrayList<edge>();
//            }
//            //acyclic directed graph
//
////
//            graph[1].add(new edge('a','c'));
//
//            graph[1].add(new edge('a','d'));
//
//            graph[2].add(new edge('b','d'));
//            graph[2].add(new edge('b','e'));
//
//            graph[3].add(new edge('c','f'));
//
//
//        }
//
//        public static void topsortUtil(ArrayList<edge> graph[],boolean vis[],char curr,Stack<Character> stack){    // time complexity big O(v + e)
//            vis[curr]= true;
//            for(int i=0;i<graph[curr].size();i++){  //adding neighbour
//                edge e= graph[curr].get(i);
//                if(!vis[e.d])
//                    topsortUtil(graph,vis,e.d,stack);
//
//            }
//            stack.push(curr);
//        }
//
//        public static void topsort(ArrayList<edge> graph[],int v){
//            boolean vis[] = new boolean[v];
//            Stack<Character> stack = new Stack<>();
//            for(int i=0;i<v;i++){
//                if(!vis[i])
//                    topsortUtil(graph,vis,i,stack);
//            }
//            while(!stack.isEmpty()){
//                System.out.print( stack.pop()+" ");
//            }
//        }
//
//        public static void main(String args[]){
//            int v=6;
//            ArrayList<edge> graph[]= new ArrayList[v];
//            creategraph(graph);
//            topsort(graph,v);
//        }
//    }
//
//
