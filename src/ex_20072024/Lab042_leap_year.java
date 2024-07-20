package ex_20072024;

import java.util.Scanner;

public class Lab042_leap_year {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the year  ");
        int user_input = src.nextInt();


        if (user_input % 4 == 0){
            System.out.printf(" %d is leapyear ", user_input);
        }else {
            System.out.printf(" %d is not leapyear ",user_input);
        }
    }
}
