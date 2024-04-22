package javaDSApw;

import java.util.Scanner;

public class reversenumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        int curr = 0;
        while(n>0){
            int r = n % 10;
            n = n/10;
            curr = curr * 10 +r;
        }
        System.out.print("total sum of digit is "+ curr);

    }
}
