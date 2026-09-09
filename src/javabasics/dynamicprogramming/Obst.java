package javabasics.dynamicprogramming;

public class Obst {
    static int[][] cost;
    static int[] keys;
    static int[] freq;

    static int optimalSearchTree(int n) {
        cost = new int[n + 1][n + 1];
        keys = new int[n + 1];
        freq = new int[n + 1];

        for (int line = 2; line <= n; line++) {
            for (int i = 1; i <= n - line + 1; i++) {
                int j = i + line - 1;
                cost[i][j] = Integer.MAX_VALUE;
                for (int r = i; r <= j; r++) {
                    int c = ((r > i) ? cost[i][r - 1] : 0) + ((r < j) ? cost[r + 1][j] : 0) + sum(i, j);
                    if (c < cost[i][j]) {
                        cost[i][j] = c;
                        keys[j] = r; // Update keys[j] instead of keys[r]
                    }
                }
            }
        }
        return cost[1][n];
    }



    static int sum(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += freq[k];
        }
        return sum;
    }

    public static void main(String[] args) {

            keys = new int[]{10, 12, 20};
            freq = new int[]{34, 8, 50};
            int n = keys.length;

            System.out.println("Cost of Optimal BST is " + optimalSearchTree(n));
        }


}
