package ex_21072024;

public class Lab056 {
    public static void main(String[] args) {

        //Function without parameters and without return type
        // Function without parameters and with return type
        // Function with parameters and without return type
        // Function with parameters and with return type

        function_type1();

        System.out.println("-------------------------");

        String name = function_type2();
        System.out.println(name);

        System.out.println("---------------------------");

        function_type3("Atanu");

        System.out.println("---------------------------- ");

        int sum = function_type4(4,5);
        System.out.println(sum);

        System.out.println("------------------------------");






    }

    static void function_type1(){
        System.out.println("Function without parameters and without return type");
    }



    static String function_type2(){
        System.out.println("Function without parameters and with return type");
        return "Atanu";
    }

    static void function_type3(String name){
        System.out.println("Function with parameters and without return type");
        System.out.println("My name is "+name);
    }

    static int function_type4(int a , int b){
        System.out.println("Function with parameters and with return type");
        return a+b;
    }




}
