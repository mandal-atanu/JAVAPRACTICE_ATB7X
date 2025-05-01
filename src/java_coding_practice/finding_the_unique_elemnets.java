package java_coding_practice;

import java.util.HashSet;
import java.util.Set;

public class finding_the_unique_elemnets {

    public static void main(String[] args) {

        String[] strArray = {"apple", "banana", "cherry", "apple", "mango", "banana", "grape"};

        Set<String> unique_elemts = new HashSet<>();

        for (String element : strArray){
            unique_elemts.add(element);
        }

        System.out.println(unique_elemts);
    }
}
