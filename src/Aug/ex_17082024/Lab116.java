package Aug.ex_17082024;

public class Lab116 {
    public static void main(String[] args) {
        String ip = null;////ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }

        System.out.println(ip);

        int a = 0;//NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        System.out.println(a);

        int c = 0;//ArithmeticException
        try {
            c = 10000/a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c);
    }
}
