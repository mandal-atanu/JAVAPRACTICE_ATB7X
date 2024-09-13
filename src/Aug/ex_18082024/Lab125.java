package Aug.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab125 {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException{
        extracted();


    }

    private static void extracted() throws FileNotFoundException, ArithmeticException {
        System.out.println("Hi Atanu");
        String path = "C:/Users/Dell/Downloads/a.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        int a = 10/0;
    }
}
