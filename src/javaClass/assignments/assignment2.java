package javaClass.assignments;

import java.util.*;
public class assignment2 {



    public static void checkLeapYear(int year){
        if( (year% 4 == 0 && year % 100 !=0) || (year % 400 == 0) ){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }


    public static void oddEvenSum(int[] arr){
        int sumOdd = 0 ;
        int evenSum = 0;

        for(int i =0;i< arr.length;i++){
            if(arr[i] % 2 == 0  ){
                evenSum += arr[i];
                System.out.println("even "+arr[i]);
            }
            else if(arr[i] % 2 !=0) {
                sumOdd += arr[i] ;
                System.out.println("odd "+arr[i]);
            }
            else{
                System.out.println("No number available");
            }
        }
        System.out.println("sum of even number is "+ evenSum);
        System.out.println("sum of odd number is "+ sumOdd);
    }


    public static int factorial(int n){
        int fact = 1;
        int i = 1;
         while(i<=n){
          fact *= i;
          i++;
      }
//        System.out.println(fact);
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year to check");
//        int year = sc.nextInt();
//        checkLeapYear(year);


        int[] arr = {3,1,4,2,6,7,0,10,24,13} ;
//        oddEvenSum(arr);

       int data = factorial(5);
        System.out.println(data);

//        for(int i=0;i<5;i++){
//            System.out.println("Hello");
//            i+=2;
//        }



    }
}
