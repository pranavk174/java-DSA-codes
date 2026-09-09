package javaDSApw;
import java.util.*;
public class loopproblem1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n= sc.nextInt();
        int count = 0;
        while(n>0){
            n = n/10;
            count ++;

        }
        System.out.print("total number of digit is "+ count);

    }
}