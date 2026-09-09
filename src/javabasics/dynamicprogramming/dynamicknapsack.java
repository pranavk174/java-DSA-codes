package javabasics.dynamicprogramming;
import java.util.*;

// memoization approach
public class dynamicknapsack {
    public static int solve(int[] weight,int[] value,int index,int capacity,int[][] dp){    //tc  O(M*N)
        if(index == 0){
            if(weight[index] <=capacity)
            {
                return value[index];
            }
            else
                return 0;
        }

        if(dp[index][capacity] != -1){
             return dp[index][capacity];
        }
        int include = 0;
        int exclude= 0;
        if(weight[index] <= capacity){
            include = value[index] + solve(weight,value,index-1,capacity - weight[index],dp);

        }
        exclude = solve(weight,value,index-1,capacity,dp);
        dp[index][capacity] = Math.max(include, exclude);  // memoization logic
        return   dp[index][capacity] ;
    }
    public static int knapsack(int[] weight,int[] value,int n,int maxweight){
       int[][] dp = new int[n+1][maxweight+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= maxweight; j++) {
                dp[i][j] = -1;
            }
        }

        return solve(weight,value,n-1,maxweight,dp);
    }

    public static void main(String[] main){
        int[] weight ={3,4,5,6};
        int[] value = {2,3,4,1};
        int n= 4;
        int w =8;
        int result = knapsack(weight,value,n-1,w);

        System.out.println("final result value is " + result);

    }
}
