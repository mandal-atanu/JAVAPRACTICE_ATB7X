package java_coding_practice;

public class palindromenumberwithoutusingbuiltinfunction {

    public static void main(String[] args) {

        String s = "Ata is a";

        String r_s = "";

        for (int i = s.length()-1; i >=0 ; i--) {

            r_s = r_s + s.charAt(i);

        }

        System.out.println(r_s);

        if (r_s.equalsIgnoreCase(s)){
            System.out.println("The string is palindrome");
        }else {
            System.out.println("not plaindrome");
        }
    }
}
