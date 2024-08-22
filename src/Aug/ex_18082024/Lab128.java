package Aug.ex_18082024;

import java.util.Scanner;

public class Lab128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("The name is -->"+name);

        if (!name.equalsIgnoreCase("Atanu")){
            try {
                throw new Exception("The name is not matching");
            } catch (Exception e) {
                System.out.println("Exception");
            }

        }else {
            System.out.println("name matched ");
        }
    }
}
