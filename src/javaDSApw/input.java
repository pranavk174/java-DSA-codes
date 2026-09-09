package javaDSApw;
import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius "  );
            int r= sc.nextInt();
        System.out.print("enter pi " );
            double pi = sc.nextDouble();
            double area = pi * r *r;


        System.out.println(area);

    }

}
