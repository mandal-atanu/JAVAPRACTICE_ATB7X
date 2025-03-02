package java_coding_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class rearrange_two_array {
    public static void main(String[] args) {
        int[] arr = {2, 0, 4, 0, 3, 0, 5, 0};
        System.out.println(Arrays.toString(rearrange(arr)));


    }

    private static int[] rearrange(int[] arr) {

        ArrayList<Integer> even_list = new ArrayList<Integer>();

        ArrayList<Integer> odd_list = new ArrayList<Integer>();

        for (int num : arr){
            if (num%2 == 0){

                even_list.add(num);

            }else {

                odd_list.add(num);

            }

        }

        Object[] even_array = even_list.toArray();

        Object[] odd_array = odd_list.toArray();

        int[] result = new int[even_array.length + odd_array.length];

        for (int i = 0; i < even_array.length; i++) {

            result[i] = (int) even_array[i];



        }

        for (int i = 0; i < odd_array.length; i++) {

            result[even_array.length + i] = (int) odd_array[i];

        }



        return result;

//        int[] new_array = new int[arr.length];
//
//        for (int i = 0; i < even_list.le; i++) {
//
//        }


    }
}
