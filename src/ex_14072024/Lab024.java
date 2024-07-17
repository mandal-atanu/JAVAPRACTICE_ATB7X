package ex_14072024;

public class Lab024 {
    public static void main(String[] args) {
        String pass = "Atanu123";
        String pass_u = pass.toLowerCase();
        System.out.println(pass.equalsIgnoreCase(pass_u));
        System.out.println(pass.substring(0,2));
        System.out.println(pass.indexOf("A"));
        System.out.println(pass.length());
    }
}
