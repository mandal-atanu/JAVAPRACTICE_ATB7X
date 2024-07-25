package ex_21072024;

import java.util.Scanner;

public class Lab054_FIZZBUZZ_ADVANCE {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = src.nextInt();

        for (int i = 0; i <= n ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i+" is divisible by both 3 and 5 so it is  FIZZBUZZ");
            } else if (i % 3 == 0) {
                System.out.println(i+" is divisible by 3 so it is FIZZ");

            } else if (i % 5 == 0) {
                System.out.println(i+" is divisible by 5 so it is BUZZ");

            }else {
                System.out.println(i);
            }


        }
    }
}
