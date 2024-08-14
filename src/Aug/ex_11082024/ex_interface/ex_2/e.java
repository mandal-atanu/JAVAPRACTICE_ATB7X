package Aug.ex_11082024.ex_interface.ex_2;

public interface e {

    void startengine();

    void stopengine();

    default void haltingenginejuststart(){
        System.out.println("Halt the engine");
    }

    default void haltingenginejuststop(){
        System.out.println("Halt the engine");
    }

    static void M1(){
        System.out.println("M1");
    }

//    void m2(){
//        System.out.println("complete function not possible in interface");  complete function not possible in interface
//    }

}


