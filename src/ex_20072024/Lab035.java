package ex_20072024;

import java.util.Scanner;

public class Lab035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks  ");
        int marks = sc.nextInt();

        char grade = 'F';

        if (marks >= 60 && marks <= 69) {
            grade = 'D';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'C';

        } else if (marks >= 80 && marks <= 89) {
            grade = 'B';

        } else if (marks >= 90 && marks <= 100) {
            grade = 'A';

        } else if (marks <= 1 || marks > 100) {
            System.out.println("LOL! Are you a god ?");

        }else {
            grade = 'F';
        }
        System.out.printf("Your grade is %c",grade);
    }
}


