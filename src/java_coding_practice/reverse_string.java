package java_coding_practice;

import java.util.Arrays;

public class reverse_string {

    public static void main(String[] args) {

        String abc = "I love india";

        String[] a = abc.split(" ");

        //int i = 0;

        //String r_s = "";

        System.out.println(Arrays.toString(a));

        for (String b : a){
            for ( int i = b.length() - 1; i >= 0; i--) {

                System.out.print(b.charAt(i));

            }
            System.out.print(" ");
        }





    }


}
