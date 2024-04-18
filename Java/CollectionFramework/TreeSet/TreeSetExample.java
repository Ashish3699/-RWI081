package CollectionFramework.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

//Creating and adding elements
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Indore");
        ts.add("VijayNagar");
        ts.add("Rewa");
        ts.add("Satna");

//Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
