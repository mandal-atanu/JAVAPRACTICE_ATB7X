package ex_27072024;

import java.util.Scanner;

public class Lab066 {
    public static void main(String[] args) {

        float marks[] = new float[4];

        Scanner src = new Scanner(System.in);

        System.out.println("Enter the marks of the sub1");
        marks[0] = src.nextFloat();

        System.out.println("Enter the marks of the sub2");
        marks[1] = src.nextFloat();

        System.out.println("Enter the marks of the sub3");
        marks[2] = src.nextFloat();

        System.out.println("Enter the marks of the sub4");
        marks[3] = src.nextFloat();

        float average_marks = marks[0] + marks[1] + marks[2]+  marks[3] / 4 ;

        System.out.println("the avg is --> "+average_marks);
    }
}
