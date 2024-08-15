package Aug.ex_11082024.staticKeyward;

public class Lab102 {


//    static
//    data members
//    Function
//    Class
    public static void main(String[] args) {
        System.out.println(ATB.Coursename);
        ATB a1 = new ATB("Atanu");

        System.out.println(a1.getName());
        ATB.doassignment();

}


}

class ATB{

    {
        System.out.println("IIB");
//        what is the purpose
//        Here you can write code related to
//        start a website or anything before starting the
//        web automation or API automation
        System.out.println("Loading the CSV file ");


    }

    static {
        System.out.println("Load the class? I will execute");
    }


    private String name;

    static  String Coursename = "ATB";

    public ATB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static void doassignment(){
        System.out.println("Just do the assignments");
    }

    static class A{

    }
}
