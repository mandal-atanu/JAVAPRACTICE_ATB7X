package ex_27072024;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
        int salary[] = new int[4];

        Scanner src = new Scanner(System.in);

        System.out.println("Enter the first salary ");
        salary[0] = src.nextInt();

        System.out.println("Enter the second salary ");
        salary[1] = src.nextInt();

        System.out.println("Enter the third salary ");
        salary[2] = src.nextInt();

        System.out.println("Enter the fourth salary ");
        salary[3] = src.nextInt();



        for (int i = 0; i < salary.length; i++) {
            System.out.print(salary[i] + " ");

        }

        System.out.println();

        int highest_sal = salary[0];

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > highest_sal){
                highest_sal = salary[i];
            }

        }
        System.out.println("highest salary is -->"+highest_sal);





    }
}
