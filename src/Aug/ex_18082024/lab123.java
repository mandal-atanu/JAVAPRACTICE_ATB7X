package Aug.ex_18082024;

public class lab123 {
    public static void main(String[] args) {
        extracted();

    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer i[] = new Integer[2];
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        } finally {
            System.out.println("end of an program");
        }
    }
}
