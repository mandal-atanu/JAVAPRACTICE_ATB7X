package ex_20072024;

import java.util.Scanner;

public class Lab036_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1  ");
        float side1 = sc. nextFloat();

        System.out.println();

        System.out.println("Enter the side2  ");
        float side2 = sc.nextFloat();

        System.out.println();

        System.out.println("Enter the side3  ");
        float side3 = sc.nextFloat();

        System.out.println();

        if (side1 == side2 && side1  == side3){
            System.out.println("The triangle is equilateral ");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles ");
            
        }else {
            System.out.println("The triangle is scalene ");
        }
    }
}
