package Aug.ex_10082024;

public class RealTimeInhertance {
    public static void main(String[] args) {

        Baseclass t1 = new testcase1();

        t1.setBrowser("opera",true);
        t1.openbrowser("chrome");
        t1.closebrowser();

    }



}


class testcase1 extends Baseclass{

    testcase1(){
        super("Atanu");
        this.setBrowser("edge",true);
    }


    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser,isAuth);

    }


}

class Baseclass{

    Baseclass(){
        System.out.println("DC -- Baseclass");
    }

    Baseclass(String a){
        System.out.println("PC--Baseclass");

    }

    private String Browser;

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser, boolean isAuth) {

        if (isAuth){
            System.out.println(this.Browser = browser);
        }else{
            System.out.println("Not allowed");
        }

    }

    void openbrowser(){
        System.out.println("Chrome browser");
    }

    void openbrowser(String browsername){
        System.out.println("open Browser !"+ browsername);
    }

    void closebrowser(){
        System.out.println("close browser");
    }
}
