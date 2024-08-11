package Aug.ex_04082024;

public class BankAccount {
    String BankName;
    int Balance;
    String BankCode;

    BankAccount(){
        BankName = "SBI";
        Balance = 12;
        BankCode = "SBI001";
    }

    BankAccount(String bname, int blan, String Bcode){
        this.BankName = bname;
        this.Balance = blan;
        this.BankCode = Bcode;
    }

    void printdetails(){
        System.out.println("Bank name --->"+BankName);
        System.out.println("Bank Balance --->"+Balance);
        System.out.println("Bankcode --->"+BankCode);
    }
}
