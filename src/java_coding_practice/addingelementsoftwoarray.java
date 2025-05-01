package java_coding_practice;

import java.util.Arrays;

public class addingelementsoftwoarray {

    public static void main(String[] args) {

        int[] a = {1,2,3};

        int[] b = {4,5,6};

        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            c[i] = a[i] + b[i];

        }

        System.out.println(Arrays.toString(c));


    }
}
