package Aug.ex_11082024.excar;

public class wagonr extends engine{

    void drive(){
        opencar();
         start();
         partgearbox();
         speed();
         stop();

    }

    @Override
    void opencar() {
        System.out.println(" the wagonR");

    }

    @Override
    void start() {
        System.out.println("Start the wagonR");

    }

    @Override
    void partgearbox() {
        System.out.println("Change the gear");

    }

    @Override
    void speed() {
        System.out.println("Max speed is 100km/h");

    }

    @Override
    void stop() {
        System.out.println("Stop the wagonR");

    }
}
