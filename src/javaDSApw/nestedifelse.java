package javaDSApw;
import java.util.*;
public class nestedifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 500; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i % 15 != 0) {
                    System.out.println("sorry but this number cant be divisible by 15 "+ i);
                }
                else
                    System.out.println("this number is divisible by 3 , 5 & 15 " + i);

            }
        }
    }
}
