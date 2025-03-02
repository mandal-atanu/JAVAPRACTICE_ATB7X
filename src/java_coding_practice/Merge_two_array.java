package java_coding_practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge_two_array {

    public static void main(String[] args) {

        int[] arr1 = {5, 3, 2};
        int[] arr2 = {9, 0, 1};

        int[] new_array = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            new_array[i] = arr1[i];

        }


        for (int i = 0; i < arr2.length; i++) {

            new_array[arr1.length + i] = arr2[i];

        }


        System.out.println(Arrays.toString(new_array));






    }
}
