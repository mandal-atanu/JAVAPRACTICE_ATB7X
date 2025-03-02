package java_coding_practice;

import java.util.Arrays;

public class incrementarray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,9};
        int[] arr2 = {9,9,9};

        System.out.println(Arrays.toString(increment(arr1)));
        System.out.println(Arrays.toString(increment(arr2)));

    }

    private static int[] increment(int[] arr) {

        int n = arr.length;

        for (int i = n-1; i >= 0 ; i--) {

            if (arr[i] < 9){
                arr[i]++;
                return arr;
            }

            arr[i] = 0;

        }

        int[] result = new int[n + 1];
        result[0] = 1; // Set the first element to 1 (since the number became larger by 1)
        return result;
    }
}
