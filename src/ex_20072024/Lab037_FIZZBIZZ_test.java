package ex_20072024;

import java.util.Scanner;

public class Lab037_FIZZBIZZ_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        System.out.println();
        System.out.printf("The number is %d",number);
        System.out.println();

        if (number % 3 == 0 && number % 5 == 0 ){
            System.out.println("The number is FIZZBUZZ");
        } else if (number % 3 == 0) {
            System.out.println("The number is FIZZ");

        } else if (number % 5 == 0) {
            System.out.println("The number is BUZZ");

        }
    }
}
