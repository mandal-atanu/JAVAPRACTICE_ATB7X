package java_coding_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Secondlargestnumberoflist2 {

    public static void main(String[] args) {

        List<Integer> abc = new ArrayList<Integer>();

        abc.add(20);
        abc.add(10);
        abc.add(60);
        abc.add(110);

        System.out.println(abc);

        Integer largest = Collections.max(abc);

        //System.out.println(second_largest);
        System.out.println(largest);

        abc.removeIf(num -> num == largest);

        Integer second_largest = Collections.max(abc);

        System.out.println(second_largest);
    }
}
