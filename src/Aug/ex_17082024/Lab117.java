package Aug.ex_17082024;

public class Lab117 {
    public static void main(String[] args) {
        int c = 0;//ArithmeticException
        try {
            String ip = args[0];////ArrayIndexOutOfBoundsException


            int a = Integer.parseInt(ip);//NumberFormatException


            c = 10000/a;
        } catch (ArrayIndexOutOfBoundsException| NumberFormatException|ArithmeticException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println(c);
        System.out.println("end of program");
    }
}
