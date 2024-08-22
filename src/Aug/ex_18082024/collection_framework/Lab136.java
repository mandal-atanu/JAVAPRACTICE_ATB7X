package Aug.ex_18082024.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab136 {
    public static void main(String[] args) {
        List<String> a = new ArrayList();

        a.add("Atanu");
        a.add("souvik");
        a.add("gola");

        for (String str : a){
            System.out.println(str);
        }

        System.out.println("--------------------------------");

        for (int i = 0; i <a.size(); i++) {
            System.out.println(a.get(i));

        }

        System.out.println("---------------------------------");

        Iterator<String> its = a.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }


    }
}
