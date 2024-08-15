package Aug.ex_11082024.reallifeex;

public class lab098 {
    public static void main(String[] args) {
        chrome c = new chrome();
        String c1  = c.openbrowser("chrome");
        System.out.println(c1);
        c.closebrowser("chrome");
        c.screenshot();

        firefox f = new firefox();
        f.screenshot();
    }
}
