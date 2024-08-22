package Aug.ex_17082024;

public class lab103 {
    public static void main(String[] args) {
//        Primitive  to wrapper class
        int a = 10;
        Integer b = a;
        System.out.println(a);
        System.out.println(b);

//        wrapper class to primitive

        Integer c = 20;// auto boxing -- int --> Integer
        int value = c;// unboxing -- integer --> int
        System.out.println(c);
        System.out.println(value);


    }
}
