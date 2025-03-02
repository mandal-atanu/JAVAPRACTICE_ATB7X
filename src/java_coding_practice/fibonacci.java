package java_coding_practice;

import javax.swing.*;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number-->");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Enter a positive number");

        }else {
            System.out.println("Fibonacci series up to " + n + " terms:");

            int first = 0;
            int second = 1;

            for (int i = 1; i <= n ; i++){
                System.out.println(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        }
    }
}
