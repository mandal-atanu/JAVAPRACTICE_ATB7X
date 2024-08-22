package Aug.ex_18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab126 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("e1");
        } catch (Exception e){
            System.out.println("e2");
        } finally {
            System.out.println("FF");
        }

        FileReader f = new FileReader(new File("C:/Users/Dell/Downloads/a.txt"));
    }
}
