package Aug.ex_18082024;

public class Lab127 {
    public static void main(String[] args)  throws Exception {

        Bank sbi = new Bank("GBP",100);

        Bank icici = new Bank("GBP", 200);

        Integer total = sbi.add(icici);
        System.out.println(total);

        System.out.println(icici.getAmount());

        icici.setAmount(400);

        System.out.println(icici.getAmount());




    }
}
