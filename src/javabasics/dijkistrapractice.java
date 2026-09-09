package javabasics;

import java.util.*;

public class dijkistrapractice {
    public static class edge {
        int src;
        int dest;
        int wt;

        public edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void creategraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }

//        graph[0].add(new edge(0, 1, 2));
//        graph[0].add(new edge(0, 2, 4));
//
//        graph[1].add(new edge(1, 3, 7));
//        graph[1].add(new edge(1, 2, 1));
//
//        graph[2].add(new edge(2, 4, 3));
//
//        graph[3].add(new edge(3, 5, 1));
//
//        graph[4].add(new edge(4, 3, 2));
//        graph[4].add(new edge(4, 5, 5));


        graph[0].add(new edge(0,1,2));
        graph[0].add(new edge(0,2,4));
        graph[1].add(new edge(1,2,-4));
        graph[2].add(new edge(2,3,3));
        graph[3].add(new edge(3,4,4));
        graph[4].add(new edge(4,1,-1));


    }

    public class pair implements Comparable<pair> {
        int v, d;

        public pair(int v, int d) {
            this.v = v;
            this.d = d;
        }


        @Override
        public int compareTo(pair p2) {
            return this.d - p2.d;
        }


    }

    public void dijkistra(ArrayList<edge> graph[], int src, int v) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int dist[] = new int[v];
        for (int i = 0; i < v; i++) {
            if (i != src)
                dist[i] = Integer.MAX_VALUE;
        }
        boolean vis[] = new boolean[v];
        pq.add(new pair(src, 0));
        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.v]) {
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    edge e = graph[curr.v].get(i);
                    int u = e.src;
                    int V = e.dest;
                    if (dist[u] + e.wt < dist[V])
                        dist[V] = dist[u] + e.wt;

                }
            }

            for (int i = 0; i < graph.length; i++) {
                System.out.print(dist[i] + " ");
            }
        }


    }
}