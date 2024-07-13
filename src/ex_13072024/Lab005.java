package ex_13072024;

public class Lab005 {
    public static void main(String[] args) {
        byte age = 122; // age > 127 // less memory  --> smart container - good practice
        int age1 = 100;  // wasting memory  - 214768348488

        // program store pi with only 2 decimal 3.14, 3.1432323233238669999

        float pi = 3.14f;
        double pi_d = 3.1432323233238669999;

        System.out.println(pi_d);
    }
}
