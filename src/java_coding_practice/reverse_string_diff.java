package java_coding_practice;

public class reverse_string_diff {

    public static void main(String[] args) {

        String str = " I love India";

        String[] arr = str.split(" ");

        for (int i = arr.length -1; i >= 0 ; i--) {

            System.out.print(arr[i]);
            System.out.print(" ");

        }
    }
}
