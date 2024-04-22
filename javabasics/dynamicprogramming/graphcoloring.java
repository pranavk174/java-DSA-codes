package javabasics.dynamicprogramming;
import java.util.*;
public class graphcoloring {
    public static class edge {
        int s;
        int dt;

        public  edge(int src,int dt){
            this.s = src;
            this.dt=dt;
        }

    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i = 0 ;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new edge(2,3));
        graph[3].add(new edge(3,1));
        graph[4].add(new edge(4,0));
        graph[4].add(new edge(4,1));
        graph[5].add(new edge(5,0));
        graph[5].add(new edge(5,2));
    }
    
    public static boolean issafetoAssign(boolean[][] board,int V,int i,int j,ArrayList<Integer> color ){
        for(int k= 0;k< V;k++){
            if (board[i][k] == true && color.get(i) == j ){    // board[i][k] == true (ye neighbour k liye)   &&  color.get(i) == j (ye chekr kkrne k liye ki neighbour k paas v same color hai ya nhi)
                return false;
            }
        }
        return true;
    }

    public static boolean fnc(boolean[][] board,int m,int V, int i,ArrayList<Integer> color){
        if (i == V) return true;

        for(int j = 0;j<m;j++){
            if(issafetoAssign(board,V,i,j,color));{
                    if(i<color.size())
                        color.set(i,j);
                if(fnc(board,m,V,i+1,color)) return true;

                color.set(i,-1);
            }
        }
        return false;
    }

    public static boolean createboard(boolean[][] board,int m,int V,ArrayList<Integer> color){
        color = new ArrayList<>(V);
        for(int i = 0;i< V;i++){
            color.add(-1);
        }

        fnc(board,m,V,0,color);

        return true;
    }

    public static void main(String[] args){
        int V = 6;
        int m=3;
        ArrayList<Integer> color = new ArrayList<>(V);
        ArrayList<edge> graph[] = new ArrayList[V];
        boolean[][] board = new boolean[V][V];

        creategraph(graph);

        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                edge e = graph[i].get(j);
                board[i][e.dt] = true;
                board[e.dt][i]= true;
            }
        }

        if(createboard(board,m,V,color)){
            System.out.println("graph coloring possible");
            for(int i=0;i<V;i++){
                System.out.println("vertex"+ i+ "color" + color.get(i));
            }
        }
        else
            System.out.println("no coloring possible bro sorryr...");
    }
}
