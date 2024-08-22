package java_coding_practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc.next();

        a = a.toLowerCase();

        a = a.replaceAll("[^a-zA-Z0-9]", "");

        String r_a = new StringBuilder(a).reverse().toString();

        if (a.equals(r_a)){
            System.out.println("it is a palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
