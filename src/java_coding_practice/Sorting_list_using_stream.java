package java_coding_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting_list_using_stream {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(2,1,3,4,5);

        List<Integer> sorted_list = l.stream().filter(a->a%2==0).collect(Collectors.toList());

        System.out.println(sorted_list);
    }
}
