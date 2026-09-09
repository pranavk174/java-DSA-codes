package javabasics.dynamicprogramming;

//recurrence relation
import java.util.*;
public class D_knapsack {
    public static int solve(ArrayList<Integer> weight,ArrayList<Integer> value,int index,int capacity,int[][] dp){
        if(index == 0){
            if(weight.get(index) <= capacity)
                return value.get(index);
            else
                return 0;
        }

        if(dp[index][capacity] != -1){
            return dp[index][capacity] ;
        }
        int include = 0;
        int exclude =0;
        if (weight.get(index) <= capacity) {
          include = value.get(index) + solve(weight,value,index-1,capacity-weight.get(index), dp);
            return include;
        }
        exclude = solve(weight,value,index-1,capacity,dp);
        dp[index][capacity] = Math.max(include,exclude);
        return  dp[index][capacity];
    }
    public static int knapsack(ArrayList<Integer> weight,ArrayList<Integer> value,int n,int maxweight){
        int[][] dp = new int[n+1][maxweight+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=maxweight;j++){
                dp[i][j] = -1;
            }
        }
        return solve(weight,value,n-1,maxweight,dp);
    }
    public static void main(String[] args){
        ArrayList<Integer> weight = new ArrayList<>();
        ArrayList<Integer> value= new ArrayList<>();
//        weight.add(3);
//        weight.add(4);
//        weight.add(6);
//        weight.add(5);
//
//
//        value.add(2);
//        value.add(3);
//        value.add(4);
//        value.add(1);


        weight.add(3);
        weight.add(6);
        weight.add(7);
        weight.add(9);


        value.add(1);
        value.add(6);
        value.add(5);
        value.add(10);

        int n= 4;
        int w =8;
        int result = knapsack(weight,value,n-1,w);

        System.out.println("final result value is " + result);

    }
}
