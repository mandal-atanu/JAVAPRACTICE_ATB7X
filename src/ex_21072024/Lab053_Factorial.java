package ex_21072024;

import java.util.Scanner;

public class Lab053_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to calculate factorial");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 1 ; i<=num; i++){
            fact = fact * i;;
        }
        System.out.println("The factorial of  "+num+" is "+fact);



    }
}
