package Aug.ex_10082024.encap;

// encapsulation

public class lab088 {
    public static void main(String[] args) {
        vmologin1 vmologin = new vmologin1("admin","password123");
        System.out.println(vmologin.getPassword());

        System.out.println(vmologin.getUsername());

        System.out.println(vmologin.getPassword());

        vmologin.setPassword("123",true);

        System.out.println(vmologin.getPassword());
    }

}

class vmologin1{

    private String username;
    private   String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isauth) {

        if(isauth){
            this.password = password;
        }else{
            System.out.println("Not allowed");
        }

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public vmologin1(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

