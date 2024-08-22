package Aug.ex_17082024;

public enum color {

    RED("#F0000000"),
    GREEN("#F000D00");


    private String hexavalue;

    color(String hexavalue) {
        this.hexavalue = hexavalue;
    }

    public String getdetails(){
        return hexavalue;

    }
}
