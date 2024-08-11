package Aug.ex_04082024;

public class ATBperson {

    String name;
    long phone_no;

    ATBperson(){
        System.out.println("Object is created");
    }

    ATBperson(String namegiven){
        this.name = namegiven;
    }

    ATBperson(String namegiven, long phone_no){
        this.name = namegiven;
        this.phone_no = phone_no;
    }
}
