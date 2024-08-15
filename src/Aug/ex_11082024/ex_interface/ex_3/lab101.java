package Aug.ex_11082024.ex_interface.ex_3;

public class lab101 {
    public static void main(String[] args) {
        lab102 l = new lab102();
        l.c();
    }





}

class lab102 extends car {

    void c(){
        opencar();
        start();
        gear();
    }

}

interface ENG{
    void start();

    default  void m1(){
        System.out.println("old m1");
    }
}

interface Gearbox extends ENG{
    void gear();

}

interface key extends Gearbox{
    void opencar();
}

class  car implements key{


    @Override
    public void opencar() {

    }

    @Override
    public void gear() {

    }

    @Override
    public void start() {

    }
}
