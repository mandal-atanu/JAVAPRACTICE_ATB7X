package Aug.ex_18082024;

import java.util.Scanner;

public class Lab129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        Integer a = sc.nextInt();

        if (a == 0){
            throw new ArithmeticException("enter non zero number");
        }
        int x = 100/a;
        System.out.println(x);
    }
}
