package java_coding_practice;

import java.util.Arrays;

public class count_of_occur {

    public static void main(String[] args) {

        String a = "Atanu";

        char b = 'a';

        char[] A_array = a.toCharArray();

        System.out.println(Arrays.toString(A_array));

        int count = 0;



        for (char c : A_array){

            if(Character.toLowerCase(c) == Character.toLowerCase(b)){
                count++;
            }


        }

        System.out.println(count);

    }
}
