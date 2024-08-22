package Aug.ex_17082024;

public class Lab120 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        } finally {
            System.out.println("code will be executed anyhow");
        }
    }
}
