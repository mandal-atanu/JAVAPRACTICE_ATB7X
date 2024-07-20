package ex_20072024;

import java.util.Scanner;

public class Lab033 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int user_input = sc.nextInt();
        System.out.printf("The number1 is %d",user_input);

        System.out.println();

        System.out.println("Enter the number2 ");
        int user_input2 = sc.nextInt();
        System.out.printf("The number2 is %d",user_input2);

        System.out.println();

        if (user_input > user_input2){
            System.out.println("number1 is bigger");
        } else if (user_input2 > user_input) {
            System.out.println("number2 is bigger");

        } else {
            System.out.println("both number is equal");
        }


    }
}
