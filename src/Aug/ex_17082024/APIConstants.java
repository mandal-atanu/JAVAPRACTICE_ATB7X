package Aug.ex_17082024;

public enum APIConstants {
    BASE_URL("http://app.vmo.com"),
    LOGIN_PAGE("http://app.vmo.com/LOGIN");


     private final String name;


    APIConstants(String name) {
        this.name = name;
    }

    public String getvalue(){
        return name;
    }
}
