package Aug.ex_10082024.poly.methodoverriding;

public class hound extends dog{

    public hound() {

        System.out.println("hound bark");
    }

    @Override
    void bark(){
        System.out.println("Hound can bark ");
    }

    void bike(){
        System.out.println("I have a bike ");
    }




}
