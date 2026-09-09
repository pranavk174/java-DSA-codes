package javaClass;

import java.util.*;
public class inputclass {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the word");
        String Word_input = sc.next();    // ye next method srf ek word ko hi input leta hai, agr word k baaad space aaya to ye uske aaghe k wordks ko ignor kr dega
//        System.out.println("Enter the sentence");
        String sentence_input = sc.nextLine(); // ye nextLine() method poore sentence ko input leta hai


      System.out.println(Word_input);
        System.out.println(sentence_input);

    }

}
