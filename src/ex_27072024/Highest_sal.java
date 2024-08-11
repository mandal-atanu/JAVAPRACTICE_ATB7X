package ex_27072024;

import java.util.Scanner;

public class Highest_sal {
    public static void main(String[] args) {

        int salary[] = new int[4];

        Scanner src = new Scanner(System.in);

        for (int i = 0; i < salary.length ; i++) {
            System.out.println("Enter the salary of person"+ (i+1));
            salary[i] = src.nextInt();


        }

        for (int i = 0; i < salary.length ; i++) {
            System.out.print(salary[i] + " ");

        }

        System.out.println();



        int highest_sal = salary[0];

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > highest_sal){
                highest_sal = salary[i];
            }

        }

        System.out.println("Highest salary is "+ highest_sal);


    }
}
