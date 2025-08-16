package java_coding_practice;

import java.util.Set;
import java.util.TreeSet;

public class third_highest {

    public static void main(String[] args) {

        int[] arr = {20,10,30,40,60,5,100,49};

        Set<Integer> set = new TreeSet<>();

        for (int a : arr){

            set.add(a);
        }

        Object[] ab = set.toArray();

        int third_max = (int) ab[ab.length-3];

        System.out.println(third_max);

    }


}
