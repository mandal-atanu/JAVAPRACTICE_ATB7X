package Aug.ex_17082024;

public class Lab115 {
    public static void main(String[] args) {
        int c = 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println("div by 0");;
        }
        System.out.println(c);
    }
}
