package CollectionFramework.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();

//Add Element
        tm.put(1,9);
        tm.put(2,8);
        tm.put(3,7);

// remove element
        tm.remove(3);
        tm.put(4,6);


        for (Map.Entry m: tm.entrySet()
             ) {
            System.out.println(m.getKey()+"--"+m.getValue());
        }
    }
}
