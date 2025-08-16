package java_coding_practice;

public class reverse_array {

    public static void main(String[] args) {

        String[] a = {"abc", "def", "ghi"};

        for (int i = a.length-1; i >= 0 ; i--) {
            System.out.print(a[i]);
            System.out.print(" ");

        }
    }
}
