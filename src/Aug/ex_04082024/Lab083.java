package Aug.ex_04082024;

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the your bankname");
        String bankname  = sc.next();

        System.out.println("enter the balance");
        int blan = sc.nextInt();

        System.out.println("enter the your bankcode");
        String Bcode = sc.next();

        BankAccount ba2 = new BankAccount(bankname, blan, Bcode);

        BankAccount ba3 = new BankAccount("SBI",1000,"vj");

        ba3.printdetails();


        ba1.printdetails();

        ba2.printdetails();

        //sc.close();


    }
}
