package javaDSApw;

import java.util.Scanner;

public class patterns {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int n= sc.nextInt();
        System.out.print("enter the number ");
        int c= sc.nextInt();
       for(int i= 0 ;i< n ;i++){
           for(int j = 0;j< c ;j++){
               if(i ==0 || i== n-1 || j == 0 || j == c-1)
                   System.out.print("* ");
               else
                   System.out.print(" ");
           }
        System.out.println();
       }

    }
}
