package javabasics.dynamicprogramming;

public class fibspaceotimization {
   public static void fib(int n){
       int prev1 = 0;
       int prev2= 1;
       int curr= 0;

       for(int i=2 ;i<=n;i++){
           curr = prev2 + prev1;
           prev1 = prev2;
           prev2 = curr;


       }

       System.out.print(curr);
   }
   public static void main(String[] args){
       int n = 6;

       fib(6);
   }

}
