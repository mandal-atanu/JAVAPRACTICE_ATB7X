package Aug.ex_04082024.accessmodifier.police;

public class cop {

     private int  gun;
     private String idcard;

    public cop(int gun){
        this.gun = gun;
    }

    protected void canishoot(){
        System.out.println("Yes you can shoot");
    }
}
