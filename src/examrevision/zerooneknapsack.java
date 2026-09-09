package examrevision;

import org.w3c.dom.css.CSSUnknownRule;

public class zerooneknapsack {
public static int solve(int weight[],int value[],int index,int capacity,int[][] dp){
    if(index == 0){
        if(weight[index] <= capacity){
            return value[index];
        }
        else
            return 0;

    }
    if(dp[index][capacity] != -1){
        return dp[index][capacity];
    }
    int include =0;
    int exclude =0;
    if(weight[index] <= capacity){
        include = value[index]+ solve(weight,value,index-1,capacity - weight[index],dp);
    }
    exclude = 0 + solve(weight,value,index-1,capacity,dp);

    dp[index][capacity]= Math.max(include,exclude);

    return dp[index][capacity];
}
    public static int knapsack(int weight[],int value[],int n,int W){
        int[][] dp = new int[n+1][W+1];
        for(int i =0;i<=n;i++){
            for(int j =0;j<=W;j++){
                dp[i][j] = -1;
            }
        }
        return solve(weight,value,n-1,W,dp);
    }
    public static void main(String[] args){
        int[] weight ={3,6,7,9};
        int[] value = {1,6,5,10};


        int[] wt ={1,2,3,4,7,8};
        int[] val ={20,5,10,25,15,40};
        int n= wt.length;
        int w =8;
        int result = knapsack(weight,value,4,w);
        System.out.println("the final answer is "+result);

        int answer = knapsack(wt,val,n-1,10);
        System.out.println(answer);
    }
}
