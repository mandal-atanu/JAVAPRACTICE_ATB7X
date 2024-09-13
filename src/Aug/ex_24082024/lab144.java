package Aug.ex_24082024;

import java.util.Hashtable;

public class lab144 {
    public static void main(String[] args) {
        Hashtable hst = new Hashtable<>();

        hst.put(1,"one");
        hst.put(null,"two");

        System.out.println(hst); // null is not allowed for hashtable
    }
}
