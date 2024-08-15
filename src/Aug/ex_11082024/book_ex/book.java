package Aug.ex_11082024.book_ex;

import java.util.Scanner;

abstract class book {

    String name;
    String author;
    double Price;

    book(String name, String author, Double Price){
        this.name = name;
        this.author = author;
        this.Price = Price;
    }

    abstract String getdetails();
}

class PrintMyBook extends book{


    PrintMyBook(String name, String author, Double Price) {
        super(name, author, Price);
    }

    @Override
    String getdetails() {
        return "Bookname:-"+name + ", author:-"+author + ", Price:-"+Price;
    }
}
