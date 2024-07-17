package ex_14072024;

public class Lab022 {
    public static void main(String[] args) {
        String name = "Atanu";
        String aaa = "Atanu";
        String name2 = new String( "Atanu");
        String name3 = new String( "Atanu");

        System.out.println(name == aaa);
        System.out.println(name == name2);
        System.out.println(name3 == name2);
        System.out.println(name.equals(name2));

    }
}
