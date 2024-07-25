package ex_21072024;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter the number");
        int n = src.nextInt();

        for (int i = 0; i <= n ; i++) {
            if (i % 2 == 0){
                System.out.println("even -->"+i);
                continue;
            }
            System.out.println("Odd--->"+i);

        }
    }
}
