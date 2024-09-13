package Aug.ex_24082024;

import java.util.HashMap;
import java.util.Map;

public class Lab143 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();

        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",3);
        map.put(null,101);
        map.put(null,102); // only one null is allowed and even user put more than one null
                           // value then it will take the latest null value

        System.out.println(map);

        System.out.println(map.containsKey("id2"));

        System.out.println(map.containsValue(3));

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println("-----------------------------");

        // How to iterate over all the elements in the map

        for (Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + "-->" + item.getValue());
        }


    }
}
