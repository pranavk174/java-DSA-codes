package examrevision;


import java.util.*;
public class bellmanford {
    public static class edge{
        int s , d,wt;

        public edge(int s,int d,int wt){
            this.s=s;
            this.d=d;
            this.wt=wt;
        }
    }
    public static void addgraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<edge>();
        }
//        graph[0].add(new edge(0,1,2));
//        graph[0].add(new edge(0,2,4));
//        graph[1].add(new edge(1,2,-4));
//        graph[2].add(new edge(2,3,2));
//        graph[3].add(new edge(3,4,4));
//        graph[4].add(new edge(4,1,-1));


        graph[0].add(new edge(0,1,6));
        graph[0].add(new edge(0,3,5));
        graph[0].add(new edge(0,4,5));
        graph[1].add(new edge(2,5,-1));
        graph[2].add(new edge(3,2,-2));
        graph[2].add(new edge(3,5,1));
        graph[3].add(new edge(4,3,-2));
        graph[3].add(new edge(4,6,-1));
        graph[4].add(new edge(5,7,3));
        graph[5].add(new edge(6,7,3));


    }
   public static void belford(ArrayList<edge> graph[],int src){
        int n = graph.length;
        int dist[] = new int[n];
        for(int i=0;i<n;i++){
            if( i != src)
                dist[i] = Integer.MAX_VALUE;
        }

        for(int i=0;i< n-1;i++){
            for(int j=0;j< n;j++){
                for(int k =0;k< graph[j].size();k++){
                    edge e = graph[j].get(k);
                    int s = e.s;
                    int d=e.d;
                    int w = e.wt;

                    if(dist[s] != Integer.MAX_VALUE  && (dist[s] + w) < dist[d])
                        dist[d] = (dist[s] + w);
                }
            }
        }
       for(int i=0;i<n;i++){
           System.out.print(dist[i]+" -> ");
       }
   }

    public static void main(String[] args){
        int V = 8;
        ArrayList<edge> graph[] = new ArrayList[V];
        addgraph(graph);
        belford(graph,0);
    }

}
