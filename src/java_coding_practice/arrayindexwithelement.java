package java_coding_practice;

import java.util.Scanner;

public class arrayindexwithelement {

    public static void main(String[] args) {

        int[] a = {1,3,3,4,5,6,61,7,8,9,9};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number -->");

        int n = sc.nextInt();

        //boolean result = false;



        for (int i = 0; i < a.length; i++) {

            if (a[i] == n){
                System.out.println(i);
                //result = true;
            }

        }

//        if (!result){
//
//            System.out.println("element not found");
//
//        }
    }
}
