package Aug.ex_17082024;

public class Lab119 {
    public static void main(String[] args) {
        try{
            String s1 = "Atanu";
            String a1 = args[0];
            int a = 10/0;
            s1 = null;
            System.out.println(s1.trim());

        }catch (Exception e){
            System.out.println("There is something wrong in the program");
            System.out.println(e.getMessage());
        }
        System.out.println("end of program!");
    }
}
