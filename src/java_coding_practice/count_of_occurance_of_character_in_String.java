package java_coding_practice;

public class count_of_occurance_of_character_in_String {

    public static void main(String[] args) {

        int count = countoccurance("Atanu",'a');
        System.out.println(count);
    }

    private static int countoccurance(String word, char character) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (Character.toLowerCase(word.charAt(i)) == character){

                count++;
            }

        }

        return count;


    }
}
