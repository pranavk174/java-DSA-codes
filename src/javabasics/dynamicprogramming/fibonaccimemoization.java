package javabasics.dynamicprogramming;
// memoization
public class fibonaccimemoization {
    public static int fib(int n){   // TC   O(N)
        int[] arr= new int[n+1];

        return fibmemo(n,arr);
    }
    public static int fibmemo(int n, int[] arr){
        if(arr[n]<= 1){
            return n;
        }

        if(arr[n]!= -1)
            return arr[n];
        arr[n] = fibmemo(n-1,arr) + fibmemo(n-2,arr);
        return arr[n];
    }
    public static void main(String[] args){
        int n= 8;
        int[] arr = new int[n+ 1];

        System.out.print(fib(n));

    }
}
