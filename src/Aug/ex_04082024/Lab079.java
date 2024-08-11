package Aug.ex_04082024;

public class Lab079 {

    int age = 69;

    int e = 45; // instance variable

    void f1(){
        int e = 10; // Local variable
        System.out.println(age);
        System.out.println(e);
    }

    void f2(){
        System.out.println(e);
    }
}
