package java_coding_practice;

public class get_the_required_string {

    public static void main(String[] args) {
            String str = "I am atanu mandal mandal and i love to do coding";

        String traget = "am atanu mandal mandal and i love to do";

        int index1 = str.indexOf("am");

        int index = str.indexOf("am atanu mandal mandal and i love to do");

        System.out.println(index1);

        String str1 = str.substring(index,index+traget.length());

        System.out.println(str1);

        int mandal_index = str.indexOf("mandal");

        int second_mandal = str.indexOf("mandal",mandal_index +1);

        System.out.println(second_mandal);

        String str2 = str.substring(0,second_mandal)+"$"+str.substring(second_mandal+"mandal".length());

        System.out.println(str2);


    }
}
