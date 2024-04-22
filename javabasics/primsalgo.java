package javabasics;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class primsalgo {
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

        public static void creategraph(ArrayList<javabasics.mstalgo.edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }


            graph[0].add(new javabasics.mstalgo.edge(0, 1, 2));
            graph[0].add(new javabasics.mstalgo.edge(0, 2, 1));

            graph[1].add(new javabasics.mstalgo.edge(1, 3, 7));
            graph[1].add(new javabasics.mstalgo.edge(1, 2, 1));

            graph[2].add(new javabasics.mstalgo.edge(2, 4, 3));

            graph[3].add(new javabasics.mstalgo.edge(3, 5, 1));

            graph[4].add(new javabasics.mstalgo.edge(4, 3, 2));
            graph[4].add(new javabasics.mstalgo.edge(4, 5, 5));


        }

        public static class pair implements Comparable<javabasics.mstalgo.pair> {
            int v;
            int cost;

            public pair(int v, int cost) {
                this.v = v;
                this.cost = cost;
            }

            public int compareTo(javabasics.mstalgo.pair p2) {
                return this.cost - p2.cost;
            }
        }

        public static void prims(ArrayList<javabasics.mstalgo.edge> graph[], int src, int v) {
            boolean vis[] = new boolean[v];     //mst set
            PriorityQueue<javabasics.mstalgo.pair> pq = new PriorityQueue<>();         //non mst set
            int finalcost = 0;
            pq.add(new javabasics.mstalgo.pair(src, 0));

            while (!pq.isEmpty()) {
                javabasics.mstalgo.pair curr = pq.remove();
                if (!vis[curr.v]) {
                    vis[curr.v] = true;
                    finalcost += curr.cost;
                    for (int i = 0; i < graph[curr.v].size(); i++) {
                        javabasics.mstalgo.edge e = graph[curr.v].get(i);
                        pq.add(new javabasics.mstalgo.pair(e.d, e.wt));
                    }
                }
            }
            System.out.println("final mst is " + finalcost);

        }
        public static void main(String args[]) {
            int v = 9;
            ArrayList<javabasics.mstalgo.edge> graph[] = new ArrayList[v];
            creategraph(graph);
            prims(graph, 0, v);

        }
    }

