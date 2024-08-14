package Aug.ex_11082024.reallifeex;

public class chrome extends Bsseclass{


    @Override
    String openbrowser(String browser) {
        System.out.println("Open the chrome.............// this code is related to chrome only");
        return "chrome opened ";
    }

    @Override
    String closebrowser(String browser) {
        System.out.println("close the chrome.............// this code is related to chrome only");
        return "chrome closed";
    }



}
