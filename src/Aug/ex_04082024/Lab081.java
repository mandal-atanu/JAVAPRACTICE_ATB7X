package Aug.ex_04082024;

public class Lab081 {
    public static void main(String[] args) {

        ATBperson P1 = new ATBperson("Atanu");
        ATBperson P3 = new ATBperson("souvik");
        ATBperson P4 = new ATBperson("Layda", 978667868);


        System.out.println(P1.name);
        System.out.println(P1.phone_no);
        System.out.println(P4.phone_no);

        ATBperson P2 = new ATBperson();
        P2.name = "Amit";
        System.out.println(P2.name);

    }



}
