package Aug.ex_17082024;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab118 {
    public static void main(String[] args) {
        // Exception
        //         // Checked --JVM Knows
        try {
            FileInputStream file = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // unchecked
        try {
            int a = 10;

            int c = a/0;

            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
