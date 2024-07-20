package ex_20072024;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  char ");
        char user_input = sc.next().charAt(0);


        switch (Character.toLowerCase(user_input)){

            case 'a','e','i','o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }


    }
}
