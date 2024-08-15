package Aug.ex_11082024.book_ex;

import java.util.Scanner;

public class lab101 {
    public static void main(String[] args) {



//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("entre the book name");
//
//        String name = sc.next();
//
//        System.out.println("enter the author");
//
//        String author = sc.next();
//
//        System.out.println("enter the price");
//        Double Price = sc.nextDouble();

        book mybook = new PrintMyBook("abc", "xyz", 120.00);

        System.out.println(mybook.getdetails());





    }
}
