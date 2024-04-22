package javabasics.dynamicprogramming;

import java.util.Arrays;

public class SubsetProblem {

  public static void subsetSum(int[] arr,int n,int sum){
      boolean[][] dp = new boolean[n+1][sum+1];

      for(int i =0;i< n;i++){
          dp[i][0] = true;
      }

      for(int i=1;i<n+1;i++){
          for(int j=1;j<sum+1;j++){
              int v = arr[i-1];
              if(v <= j  && dp[i-1][j-v] == true){         //include
                  dp[i][j]= true;
              }
              else if(dp[i-1][j] == true){      //exclude
                  dp[i][j]= true;
              }
          }
      }

        System.out.println("the  answer is "+dp[n][sum]);
  }
  public static void main(String[] args){
      int[] arr = {4,2,7,1,3};
      int sum = 10;
      int n=arr.length;
      subsetSum(arr,n,sum);
  }
}
