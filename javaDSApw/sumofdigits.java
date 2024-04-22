package javaDSApw;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        int sum = 0;
        while(n>0){
            int r = n % 10;
                n = n/10;
           sum = sum + r;
        }
        System.out.print("total sum of digit is "+ sum);

    }
}
