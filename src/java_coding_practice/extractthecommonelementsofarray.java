package java_coding_practice;

import java.util.ArrayList;

public class extractthecommonelementsofarray {

    public static void main(String[] args) {

        int[] a = {1,2,3,4};

        int[] b = {1,2,5,6};

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {

            if (a[i] == b[i]){
                al.add(a[i] );
            }
            
        }

        Object[] k = al.toArray();

        for (Object object : k){
            System.out.println(object);
        }

    }
}
