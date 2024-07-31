package ex_27072024;

import java.util.Scanner;

public class Lab060 {
    public static void main(String[] args) {

        int marks[] = new int[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value of marks array  -->");
        marks[0] = sc.nextInt();


        marks[1] = 90;
        marks[2] = 80;

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(i +"-->"+marks[i]);


        }

        String weekday[] = {"Sunday","Monday","Tuesday","Wednesday"};

        for (int i = 0; i < weekday.length ; i++) {
            System.out.println(weekday[i]);

        }
    }
}
