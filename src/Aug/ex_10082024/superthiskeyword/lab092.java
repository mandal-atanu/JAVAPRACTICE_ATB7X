package Aug.ex_10082024.superthiskeyword;

public class lab092 {

    // use super();
    //1. use of super with variables
    //2. use of super with constructor

    // super keyword in java is a reference variable that allows
    // a subclass -- child class
    // to refer to its parent class

    public static void main(String[] args) {


        car c1 = new car();

        c1.display();
    }




}

class car extends vehicle{

    private int maxspeed = 281;

    car(){


        super(2);// constructor chaining
        System.out.println("DC constructor");
    }



    void display(){
        System.out.println("car speed is -->"+ this.maxspeed);
        System.out.println("vehicle speed is -->"+ super.maxSpeed);
        this.message();
        super.message();
    }

    @Override
    void message(){
        System.out.println("Hello car");
    }

}

class vehicle{
    public  int maxSpeed = 180;

    vehicle(){
        System.out.println("DC Vehicle");
    }

    vehicle(int a){
        System.out.println("PC Vehicle");
    }

    void message(){
        System.out.println("Hello vehicle");
    }

    void message(int a){
        System.out.println("Hello vehicle");
    }


}
