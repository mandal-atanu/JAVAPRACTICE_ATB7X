package Aug.ex_17082024;

public class Lab114 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int c = a/0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("error div by 0 "+e);
        }
    }
}
