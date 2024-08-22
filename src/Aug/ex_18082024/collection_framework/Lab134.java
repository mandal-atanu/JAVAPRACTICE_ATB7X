package Aug.ex_18082024.collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Lab134 {
    public static void main(String[] args) {

        List a = new ArrayList<>();

        a.add("Atanu");
        a.add("Anusha");
        a.add("Kiran");
        a.add("Atanu");
        System.out.println(a);

        System.out.println(a.size());

        System.out.println(a.remove("Atanu"));
        System.out.println(a);
        a.set(1,"Kiran Dutta");
        System.out.println(a);

        for (int i = 0; i <a.size(); i++) {
            System.out.println(a.get(i));

        }

        System.out.println("--------------------------------------------");

        for (Object o:a){
            System.out.println(o);
        }

        System.out.println(a.get(1));




    }
}
