package Aug.ex_17082024;

public class Lab107 {
    public static void main(String[] args) {
        APIautomation api = new APIautomation();
        // SIB is created one time
        // IIB is created when object is created
    }

}

class APIautomation{
    static {
        System.out.println("Loaded the data from the MySQL");
    }
    {
        System.out.println("Loaded data from MySQL");
    }
}
