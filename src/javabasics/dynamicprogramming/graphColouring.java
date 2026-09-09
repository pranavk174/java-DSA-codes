package javabasics.dynamicprogramming;

import java.util.*;

public class graphColouring {
    public static class Edge {
        int s;
        int dt;

        public Edge(int src, int dt) {
            this.s = src;
            this.dt = dt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static boolean isSafeToAssign(boolean[][] board, int V, int i, int j, ArrayList<Integer> color) {
        for (int k = 0; k < V; k++) {
            if (board[i][k] == true && color.get(k) == j) {
                return false;
            }
        }
        return true;
    }

    public static boolean func(boolean[][] board, int m, int V, int i, ArrayList<Integer> color) {
        if (i == V) return true;

        for (int j = 0; j < m; j++) {
            if (isSafeToAssign(board, V, i, j, color)) {
                if (i < color.size()) {
                    color.set(i, j);
                } else {
                    color.add(j);
                }
                if (func(board, m, V, i + 1, color)) {
                    return true;
                }
                if (i < color.size()) {
                    color.set(i, -1);
                } else {
                    color.remove(i);
                }
            }
        }
        return false;
    }

    public static boolean createBoard(boolean[][] board, int m, int V, ArrayList<Integer> color) {
        color = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            color.add(-1);
        }

        return func(board, m, V, 0, color);
    }

    public static void main(String[] args) {
        int V = 6;
        int m = 3;
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean[][] board = new boolean[V][V];

        createGraph(graph);

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                board[i][e.dt] = true;
                board[e.dt][i] = true;
            }
        }

        ArrayList<Integer> color = new ArrayList<>();
        if (createBoard(board, m, V, color)) {
            System.out.println("Graph coloring possible:");
            for (int i = 0; i < V; i++) {
                System.out.println("Vertex " + i + " -> Color " + color.get(i));
            }
        } else {
            System.out.println("No coloring possible, sorry...");
        }
    }
}