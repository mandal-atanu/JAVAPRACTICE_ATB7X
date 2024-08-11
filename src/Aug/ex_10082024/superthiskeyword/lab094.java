package Aug.ex_10082024.superthiskeyword;

public class lab094 {
    public static void main(String[] args) {


        //super.variable
        // super.method()
        // super() -> DC
        // super("prommod") -> PC
        // this()
        // this.variablename

        student1 s2 = new student1();

    }




}

class Person1{

    Person1(){
        System.out.println("Person1----DC");
    }

    Person1(String a ){
        System.out.println("Person1----PCA1");
    }

    Person1(String a, int a1){
        System.out.println("Person1----PCA2");
    }
}

class student1 extends Person1{
    student1(String s){
        System.out.println("PC -- Student");

    }



    student1(){
        //this("Atanu");
        //super();
        //super("promod");
        super("promod",12);
    }
}
