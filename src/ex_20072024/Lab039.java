package ex_20072024;

import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  char ");
        char user_input = sc.next().charAt(0);


        switch (Character.toLowerCase(user_input)) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("other than vowel");
        }

    }
}
