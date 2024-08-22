package Aug.ex_17082024;

import jdk.dynalink.beans.StaticClass;

public class lab106 {
    public static void main(String[] args) {
        A.m1();
        System.out.println(A.discount);

        A a = new A();

        A a2 = new A();
        System.out.println(a.age);

    }

}

class A{
    int age = 10;// instance variable
    static  int discount = 199;

    static {
        System.out.println("SIB-a");
    }
    {
        System.out.println("IIB");
    }

    static  void m1(){
        System.out.println("m1");
    }

    void m2(){
        System.out.println("m2");
    }
}
