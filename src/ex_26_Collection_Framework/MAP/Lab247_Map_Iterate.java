package ex_26_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab247_Map_Iterate {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 100);

        // Iterate, For Loop, x,EntrySet, Iterator - x
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());
        }


    }
}
