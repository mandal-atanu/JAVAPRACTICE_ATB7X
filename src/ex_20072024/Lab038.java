package ex_20072024;

import java.util.Scanner;

public class Lab038 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("enter the day");
        int day = src.nextInt();

        switch (day) {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THUR");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
        }
        System.out.println("Outside of switch ");
    }
}
