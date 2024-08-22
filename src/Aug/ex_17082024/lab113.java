package Aug.ex_17082024;

public class lab113 {
    public static void main(String[] args) {
        String ip = args[0];////ArrayIndexOutOfBoundsException

        System.out.println(ip);

        int a = Integer.parseInt(ip);//NumberFormatException
        System.out.println(a);

        int c = 10000/a;//ArithmeticException
        System.out.println(c);
    }
}
