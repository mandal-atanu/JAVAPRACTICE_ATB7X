package Aug.ex_17082024;

public class Lab109 {
    public static void main(String[] args) {
        c c1 = new c("Honda");
        c1.drive();
        System.out.println(c1.make);
        // To use inner class object
        c.Gearbox cg = c1.new Gearbox();
        cg.m2();



    }


}

class c{
    String make;

    public c(String make) {
        this.make = make;
    }

    void drive(){
        System.out.println("You can drive car");
    }

    class Gearbox {
        void m2(){
            System.out.println("m2");
        }
        class nulboults{

        }
    }
}
