package javaClass;

import java.util.Scanner;

public class inputsum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        int sum = a+b;
        int product = a*b ;
        int minus = a- b ;
        int remainder = a%b ;
        float divide = a/b ;


        System.out.println( "total sum = " + sum);
        System.out.println( "product = " + product );
        System.out.println( "remainder = " + remainder);
        System.out.println( "minus = " + minus);
        System.out.println( "divide = " + divide);
    }
}
