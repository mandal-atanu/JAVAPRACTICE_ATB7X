package Aug.ex_11082024.ex_interface;

public class wagonR implements engine{

    void drive(){
        startengine();
        stopengine();
    }
    @Override
    public void startengine() {
        System.out.println("starting the wagonR");
    }

    @Override
    public void stopengine() {
        System.out.println("stopping the wagonR");

    }
}
