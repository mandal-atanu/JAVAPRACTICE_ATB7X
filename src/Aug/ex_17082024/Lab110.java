package Aug.ex_17082024;

public class Lab110 {
    public static void main(String[] args) {
        abc a = new abc() {
            @Override
            public void m1() {

            }

            @Override
            public void m2() {

            }
        };

        cba c = new cba() {
            @Override
            void m3() {

            }
        };
    }

}
interface abc{
    void m1();
    void m2();
}

abstract class cba{
    abstract void  m3();

}
