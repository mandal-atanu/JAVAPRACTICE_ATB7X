package java_coding_practice;

import java.util.Scanner;

public class abc {
    protected String  msg = null;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

class def extends abc{

    @Override
    public String getMsg() {
        return super.getMsg();
    }

    @Override
    public void setMsg(String msg) {
        super.setMsg(msg);
    }
}

class xyz extends def{

    protected String actualmsg;

    Scanner sc = new Scanner(System.in);
    String getActualmsg = sc.next();

    @Override
    public String getMsg() {
        return super.getMsg();
    }




}


