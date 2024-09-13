package Aug.ex_24082024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab141 {
    public static void main(String[] args) {
         // List allow duplicates
        // set does not allow duplicate

        Set hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("watermelon");

        System.out.println(hs);

        Set lhs = new LinkedHashSet();

        lhs.add("Apple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add(null);

        System.out.println(lhs);

        System.out.println(lhs.contains("Apple"));

        Set ts = new TreeSet<>();

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("watermelon");
        ts.add("orange");
        ts.add(null); // tree set do sorting hence null is not allowed

        System.out.println(ts);
    }
}
