package Aug.ex_10082024.encap;

public class icici {

    private  String name;
    private  long bal;

    public icici(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isadmin) {
        if (isadmin){
            this.name = name;
        }else {
            System.out.println("Not allowed");
        }
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isadmin) {
        if (isadmin){
            this.bal = bal;
            System.out.println("The new balance is -->"+bal);
        }else {
            System.out.println("Not allowed");
        }
    }
}
