package java_coding_practice;

import java.util.HashMap;

public class countnumberofaccuranceofelementinarray {

    public static void main(String[] args) {

        int[] a = {1,1,2,3,3,3,4,5};

        HashMap<Integer,Integer> count = new HashMap<>();

        for(int ele : a){

            count.put(ele,count.getOrDefault(ele,0)+1);


        }

        for (int key : count.keySet()){
            System.out.println(key+ "--"+ count.get(key));
        }
    }
}
