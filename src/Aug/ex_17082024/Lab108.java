package Aug.ex_17082024;

public class Lab108 {

}


class oc{
    Integer a = 10;

    void outerclass(){
        //System.out.println(b);// THis is not possible to use inner class variable in outer class
        System.out.println("OC_M1");
    }

    static class p{

    }

    class innerclass{
        Integer b = 20;
        void m2(){
            System.out.println(a);

        }
    }
}
