package genericsdemo;

public class Tclass {

    public static void main(String[] args) {


        Test<Integer> i = new Test<Integer>(5);
        System.out.println(i.getObj());

    }


}

class Test <T>{
    T  obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }
}
