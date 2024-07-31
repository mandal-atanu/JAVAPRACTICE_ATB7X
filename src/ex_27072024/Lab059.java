package ex_27072024;

import java.util.Scanner;

public class Lab059 {
    public static void main(String[] args) {

        int marks[] = new int[3]; // array  -> new

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value of marks array  -->");
        marks[0] = sc.nextInt();


        marks[1] = 90;
        marks[2] = 80;


        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);



        // len --> 3
        // index --> 0,1,2

        String shoppings[] = new String[3];
        System.out.println(shoppings[0]);

    }
}
