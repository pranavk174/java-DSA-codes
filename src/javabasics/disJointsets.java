package javabasics;

public class disJointsets {
    public static int n = 7;
    public static int[] par = new int[n];
    public static int[] rank = new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i] = i;
        }
    }
    public static int find(int data){           //to fid the leader
        if(data == par[data])
            return data;

        return find(par[data]);
    }

    public static void union(int a,int b){          //to join 2 sets
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }
        else
            par[parB] = parA;
    }

    public static void main(String[] args){
        init();
        System.out.println(find(3));
        union(1,3);
        int f = find(3);
        System.out.println(f);
        union(2,4);
        union(3,6);
        union(1,4);
        int f2 = find(3);
        System.out.println(f2);
        System.out.println(find(4));
        union(1,5);
    }
}
