package javaDSApw;

import java.util.Scanner;

public class power {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base number ");
        int b= sc.nextInt();
        System.out.print("enter the power number ");
        int p= sc.nextInt();
        int power = 1;

        for(int i=0;i<p;i++){
             power = power * b;
        }

        System.out.print("total power of digit is "+ power);

    }
}
