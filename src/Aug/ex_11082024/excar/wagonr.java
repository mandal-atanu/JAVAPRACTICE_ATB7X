package Aug.ex_11082024.excar;

public class wagonr extends engine {

    void drive() {
        opencar();
        start();
        partgearbox();
        speed();
        stop();

    }

    @Override
    void opencar() {
        System.out.println("Open wagonr car");
    }

    @Override
    void partgearbox() {
        System.out.println("Part of gear box wagonr");

    }

    @Override
    void stop() {

        System.out.println("stop the wagonr");

    }

    @Override
    void start() {
        System.out.println("Start the wagonr");

    }

    @Override
    void speed() {
        System.out.println("100km/hr");
    }

}










