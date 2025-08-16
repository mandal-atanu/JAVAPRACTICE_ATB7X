package java_coding_practice;

import java.util.Arrays;
import java.util.Comparator;

public class sortingthearrayinascending {

    public static void main(String[] args) {

        int[] a = {2,1,5,3,7,15,11};

        int temp;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]){

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }

        String[] abc = {"ab","b","acb"};

        Arrays.sort(abc);

        Arrays.sort(abc, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(abc));
    }
}
