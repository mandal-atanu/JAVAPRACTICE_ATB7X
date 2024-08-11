package Aug.ex_04082024;

public class Lab082 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("hdfc", 120,"hdfc001");


        System.out.println(ba1.BankName);
        System.out.println(ba1.Balance);
        System.out.println(ba1.BankCode);

        BankAccount ba2 = new BankAccount("icici", 123,"ICICI001");


        System.out.println(ba2.BankName);
        System.out.println(ba2.Balance);
        System.out.println(ba2.BankCode);

        ba1.printdetails();
    }
}
