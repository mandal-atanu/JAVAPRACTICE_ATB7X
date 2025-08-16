package java_coding_practice;

public class shortest_element_in_array {

    public static void main(String[] args) {

        String[] str = {"abc","abcd","abcde","a"};

        String shortest_elemnt = str[0];

        for (int i = 0; i < str.length; i++) {

            if (str[i].length() < shortest_elemnt.length()){

                shortest_elemnt = str[i];
            }

        }

        System.out.println(shortest_elemnt);
    }
}
