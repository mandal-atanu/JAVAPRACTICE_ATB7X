package java_coding_practice;

import java.util.ArrayList;
import java.util.List;

public class Secondlargestnumberoflist {

    public static void main(String[] args) {

        List<Integer> abc = new ArrayList<Integer>();

        abc.add(20);
        abc.add(10);
        abc.add(60);
        abc.add(110);

        System.out.println(abc);

        Integer largest = null;

        Integer second_largest = null;

        for (Integer number : abc){

            if (largest == null || number > largest){

                second_largest = largest;

                largest = number;

            } else if ((second_largest == null || number > second_largest) && number != largest) {

                second_largest = number;


            }

        }

        System.out.println(second_largest);
        System.out.println(largest);
    }
}
