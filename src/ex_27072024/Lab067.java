package ex_27072024;

import java.util.Scanner;

public class Lab067 {
    public static void main(String[] args) {

        float marks[] = new float[4];

        Scanner src = new Scanner(System.in);

        for (int i = 0; i < marks.length ; i++) {
            System.out.println("enter the marks of sub"+ (i+1));
            marks[i] = src.nextFloat();

        }

        float average_marks = marks[0] + marks[1] + marks[2] + marks[3] / 4 ;
        System.out.println("the average marks is -->"+average_marks);


        src.close();


    }
}
