package Aug.ex_18082024.collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lab135 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();

        marks.add(91);
        marks.add(100);
        marks.add(20);
        marks.add(40);
        marks.add(10);

        System.out.println(marks);

        Collections.sort(marks);

        System.out.println(marks);

    }
}
