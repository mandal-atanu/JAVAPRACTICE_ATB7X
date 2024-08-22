package Aug.ex_17082024;

public class Lab121 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());;
        } finally {
            System.out.println("I will be always executed ");
        }
    }
}
