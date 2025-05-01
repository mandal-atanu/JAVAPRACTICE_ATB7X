package java_coding_practice;

import java.util.Scanner;

public class ssss {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");

        int n = sc.nextInt();

        int count = numberofoneoccurance(n);

        System.out.println(count);
    }

    private static int numberofoneoccurance(int n) {

        //int lastdigit = n % 10;

        int count = 0;

        while (n > 0) {
            if (n % 10 == 1) {

                count++;
            }

            n = n / 10;

        }
        return count;
    }
}