package ex_20072024;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number1 ");
        int user_input = sc.nextInt();

        System.out.println("Enter a number2 ");
        int user_input2 = sc.nextInt();


        System.out.printf("the number is %d",user_input);
        System.out.println();
        System.out.printf("the number is %d",user_input2);

        System.out.println();

        if (user_input % 2 == 0){
            System.out.println("The number1 is even");
        }else {
            System.out.println("The number1  is odd");
        }

    }
}
