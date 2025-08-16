package java_coding_practice;

import java.util.Scanner;

public class A_number_is_prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        boolean isprime = true;

        if (n <= 1){
            isprime = false;
        } else if (n == 2) {
            isprime = true;

        }else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0){
                    isprime = false;
                    break;
                }

            }
        }

        if (isprime){
            System.out.println(n + "is a prime number");
        }else {
            System.out.println(n + "not a prime number");
        }
    }
}
