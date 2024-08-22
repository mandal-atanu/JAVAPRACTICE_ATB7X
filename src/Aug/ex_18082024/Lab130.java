package Aug.ex_18082024;

public class Lab130 {
    public static void main(String[] args) throws Exception {
        String s = "        null null        ";
        System.out.println(s);

        if (s == null){
           throw new Exception("Enter a proper string");
         }
         System.out.println(s.trim());
    }
}
