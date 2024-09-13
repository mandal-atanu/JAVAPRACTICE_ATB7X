package Aug.ex_24082024;

import java.util.ArrayList;
import java.util.List;

public class Lab140 {
    public static void main(String[] args) {

        person p1 = new person("atanu","Cap camp");
        person p2 = new person("Gola","Cap camp");
        person p3 = new person("mama","kestopur");

        List l = new ArrayList<>();

        l.add(p1);
        l.add(p2);
        l.add(p3);

        System.out.println(l);

    }
}

class person{
    String name;
    String Address;

    public person(String name, String address) {

        this.name = name;
        this.Address = address;
    }

    @Override
    public String toString() {
        return "id -->"+name + " address-->"+ Address;
    }
}
