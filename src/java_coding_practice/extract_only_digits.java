package java_coding_practice;

import java.util.ArrayList;

public class extract_only_digits {

    public static void main(String[] args) {

        String a = "atanu321";

        ArrayList<Character> c = new ArrayList<Character>();

        for (char b : a.toCharArray()){

            if (Character.isDigit(b)){

                c.add(b);







            }
        }

        Object[] d = c.toArray();

        for (int i = d.length-1; i>= 0 ; i--) {

            System.out.print(d[i]);

            if (i != 0){

                System.out.print(",");
            }

        }


    }
}
