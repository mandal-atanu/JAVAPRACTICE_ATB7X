package java_coding_practice;

import java.util.HashSet;

public class findingduplicateelements {
    public static void main(String[] args) {


        String[] strArray = {"apple", "banana", "cherry", "apple", "mango", "banana", "grape"};

        // Create a HashSet to store unique elements
        HashSet<String> uniqueElements = new HashSet<>();
        HashSet<String> duplicateElements = new HashSet<>();

        // Loop through the array to find duplicates
        for (String str : strArray) {
            if (!uniqueElements.add(str)) {  // If add() returns false, it's a duplicate
                duplicateElements.add(str);
            }
        }

        // Print the duplicate elements
        if (!duplicateElements.isEmpty()) {
            System.out.println("Duplicate elements in the array: " + duplicateElements);
        } else {
            System.out.println("No duplicate elements found.");
        }
    }

}
