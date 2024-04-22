package javabasics;

import java.util.*;


public class mstalgo {
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

    public static void prims(ArrayList<edge> graph[], int src, int v) {
        boolean vis[] = new boolean[v];     //mst set
        PriorityQueue<pair> pq = new PriorityQueue<>();         //non mst set
        int finalcost = 0;
        pq.add(new pair(src, 0));

        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;
                finalcost += curr.cost;
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    edge e = graph[curr.v].get(i);
                    pq.add(new pair(e.d, e.wt));
                }
            }
        }
        System.out.println("final mst is " + finalcost);


    }

    public static void dijkistra(ArrayList<edge> graph[], int src, int V) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[V];
        int dest[] = new int[V];
        pq.add(new pair(src, 0));
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dest[i] = Integer.MAX_VALUE;
            }
        }

        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.v]) {
                vis[curr.v] = true;

                for (int i = 0; i < graph[curr.v].size(); i++) {
                    edge e = graph[curr.v].get(i);
                    int x = e.s;
                    int y = e.d;
                    if (dest[x] + e.wt < dest[y]) {
                        dest[y] = dest[x] + e.wt;
                        pq.add(new pair(y, dest[y]));
                    }
                }
            }

        }
        for (int i = 0; i < V; i++) {
            System.out.print(dest[i] + " ");
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
