package java_coding_practice;

import java.util.Arrays;
import java.util.Collections;

public class array_descending {
    public static void main(String[] args) {

        Integer[] a = {1,2,3,4,5};

        Arrays.sort(a, Collections.reverseOrder());

        System.out.println(Arrays.toString(a));
    }
}
