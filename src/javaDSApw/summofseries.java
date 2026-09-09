package javaDSApw;

import java.util.Scanner;

public class summofseries {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        int sum = 0;


        for(int i=0;i<=n;i++){
            if(i % 2 == 0){
                sum -= i;
            }
            else
                sum+= i;
        }
        System.out.print("total sum of digit is "+ sum);

    }
}
