package javabasics;
import java.util.*;

public class fractionalknapsack {

    public static void Fknapsack( int n,int value[],int weight[],int capacity ){
        double[] ratio = new double[n];
        for(int i = 0; i< n;i++){
            ratio[i] = value[i]/ (double)weight[i];
        }
        double sum = 0;
        for(int i =0 ;i<n ;i++){
            if(weight[i] <= capacity) {
                capacity -= weight[i];
                sum += value[i];
            }
            else {
                sum +=  (ratio[i] * capacity);
                break;
            }
        }
        System.out.println("the final value of the knapsack profit is "+ sum);
    }
    public static void main(String args[]){
       int weight[] = {10,20,30};
        int value[]={60,100,120};
        int w= 50;
        int n= weight.length;

       Fknapsack(n,value,weight,w);



    }
}
