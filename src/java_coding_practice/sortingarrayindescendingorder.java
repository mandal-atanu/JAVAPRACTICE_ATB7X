package java_coding_practice;

import java.util.Arrays;

public class sortingarrayindescendingorder {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        int temp;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {


                if (a[i] < a[j]) {

                    temp = a[i];

                    a[i] = a[j];
                    a[j] = temp;



                }


            }


        }

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//
//        }

        System.out.println(Arrays.toString(a));

    }

}
