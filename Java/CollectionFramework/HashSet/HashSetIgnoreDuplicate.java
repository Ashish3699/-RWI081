package CollectionFramework.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIgnoreDuplicate {
    public static void main(String[] args) {

        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Satna");
        set.add("Indore");
        set.add("Rewa");
        set.add("Indore");

        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
