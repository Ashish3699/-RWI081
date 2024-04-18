package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.Map;

public class NoDuplicateStoreExample {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
  
        hm.put(1,"Ram");
        hm.put(2,"Shyam");
        hm.put(3,"Shiv");
        hm.put(2,"Shyam");

        for (Map.Entry i: hm.entrySet()
             ) {
            System.out.println(i.getKey()  +"--"+i.getValue());
        }
    }
}
