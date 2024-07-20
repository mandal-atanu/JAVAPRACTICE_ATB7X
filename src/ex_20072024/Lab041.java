package ex_20072024;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println("enter number1");
        int number1 = src.nextInt();


        System.out.println("enter number2");
        int number2 = src.nextInt();


        System.out.println("enter number3");
        int number3 = src.nextInt();

        System.out.println("The first number is  "+number1);

        System.out.println("The second number is  "+number2);

        System.out.println("The third number is  "+number3);

        if (number1 > number2 && number1 > number3){
            System.out.println("The largest number is  "+number1);

        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The largest number is  "+number2);

        }else {
            System.out.println("The largest number is  "+number3);
        }


    }
}
