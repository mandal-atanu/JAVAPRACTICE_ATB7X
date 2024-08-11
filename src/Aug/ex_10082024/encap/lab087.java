package Aug.ex_10082024.encap;

// encapsulation

public class lab087 {
    public static void main(String[] args) {
        vmologin vmologin = new vmologin("admin","password123");
        System.out.println(vmologin.password);
        vmologin.password = "123";
        System.out.println(vmologin.password);
    }

}

class vmologin{

    public String username;
    public  String password;

    public vmologin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

