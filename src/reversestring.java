public class reversestring {

    public static void main(String[] args) {

        String input = "I\"Love\"India\"";

        // Remove the escape character `\` if present, but keep the quotes `"`
        input = input.replace("\"", " ");

        // Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();

        // Output the result
        System.out.println(reversed);
    }
}
