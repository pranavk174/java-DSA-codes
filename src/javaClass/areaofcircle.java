package javaClass;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double pi = 3.14;
        System.out.println("Enter radius");
        int r = sc.nextInt();

        double area = pi * r * r ;



        System.out.println( "total sum = " + area);

    }
}
