package java_coding_practice;

public class consecutive_same_digit {
    public static void main(String[] args) {
        int start = 10;
        int end = 1000;

        System.out.println("Numbers with consecutive digits being the same:");
        for (int num = start; num <= end; num++) {
            if (hasSameConsecutiveDigits(num)) {
                System.out.println(num);
            }
        }
    }

    private static boolean hasSameConsecutiveDigits(int num) {
        int lastDigit = num % 10; // Extract the last digit

        // Check all digits
        while (num > 0) {
            int currentDigit = num % 10; // Get the current last digit
            if (currentDigit != lastDigit) {
                return false; // If a digit differs, return false
            }
            num /= 10; // Remove the last digit
        }
        return true;
    }
}
