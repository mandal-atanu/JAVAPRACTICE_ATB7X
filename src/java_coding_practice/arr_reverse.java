package java_coding_practice;

public class arr_reverse {

    public static void main(String[] args) {

        String sr = "I love india";

        String[] arr = sr.split(" ");

        String r_s = "";

        for (int i = arr.length-1; i >=0 ; i--) {

            //System.out.print(" ");

            for (int j = arr[i].length()-1; j >=0 ; j--) {

                //System.out.print(" ");

                r_s = r_s + arr[i].charAt(j);




            }
            r_s = r_s + " ";

        }

        System.out.println(r_s + " ");
    }
}
