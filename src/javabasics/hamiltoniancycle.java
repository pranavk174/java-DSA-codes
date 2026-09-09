package javabasics;
import java.util.*;

public class hamiltoniancycle {


        public static class Edge {
            int s;
            int d;


            public Edge(int s, int d) {
                this.s = s;
                this.d = d;

            }
        }

        public static void createGraph(ArrayList<Edge>[] graph) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }

            // Add edges to the graph (undirected)
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));

            graph[1].add(new Edge(1, 0));
            graph[1].add(new Edge(1, 3));
            graph[1].add(new Edge(1, 2));

            graph[2].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 1));
            graph[2].add(new Edge(2, 4));

            graph[3].add(new Edge(3, 1));
            graph[3].add(new Edge(3, 4));
            graph[3].add(new Edge(3, 5));

            graph[4].add(new Edge(4, 2));
            graph[4].add(new Edge(4, 3));
            graph[4].add(new Edge(4, 5));

            graph[5].add(new Edge(5, 3));
            graph[5].add(new Edge(5, 4));
        }

        public static boolean hamiltonianCycle(ArrayList<Edge>[] graph) {
            int V = graph.length;
            boolean[] visited = new boolean[V];
            ArrayList<Integer> path = new ArrayList<>();

            // Start from any vertex, let's say 0
            return hamiltonianCycleUtil(graph, visited, path, 0, 0);
        }

    private static boolean hamiltonianCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, ArrayList<Integer> path, int current, int count) {
        visited[current] = true; // Current vertex ko visited mark karo.
        path.add(current); // Current vertex ko path mein add karo.

        if (count == graph.length - 1) { // Agar saare vertices visit ho gaye hain, matlab cycle milti hai.
            int lastVertex = path.get(path.size() - 1); // Path ka antim vertex nikalo.
            for (int i = 0; i < graph[lastVertex].size(); i++) { // Antim vertex ke saare neighbours ko dekho.
                Edge edge = graph[lastVertex].get(i);
                if (edge.d == path.get(0)) { // Agar koi neighbour shuruwat vertex se connected hai, toh cycle mil gayi.
                    path.add(path.get(0)); // Shuruwat vertex ko path mein daalo taaki cycle complete ho.
                    System.out.println("Hamiltonian Cycle: " + path); // Cycle ko print karo.
                    return true; // Cycle milti hai, true return karo.
                }
            }
        } else { // Agar cycle nahi milti, toh dusre vertices ko explore karo.
            for (int i = 0; i < graph[current].size(); i++) { // Current vertex ke neighbours ko dekho.
                Edge edge = graph[current].get(i);
                if (!visited[edge.d]) { // Agar neighbour pehle se visited nahi hai.
                    if (hamiltonianCycleUtil(graph, visited, path, edge.d, count + 1)) { // Recursively cycle ke liye check karo.
                        return true; // Agar cycle mil gayi, true return karo.
                    }
                }
            }
        }

        visited[current] = false; // Backtrack: Current vertex ko unvisited mark karo.
        path.remove(path.size() - 1); // Backtrack: Current vertex ko path se hata do.
        return false; // Cycle nahi milti, false return karo.
    }


    public static void main(String[] args) {
            int V = 6;
            ArrayList<Edge>[] graph = new ArrayList[V];
            createGraph(graph);

            if (!hamiltonianCycle(graph)) {
                System.out.println("No Hamiltonian Cycle exists.");
            }
        }
    }


