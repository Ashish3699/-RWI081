package CollectionFramework.Iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {


        Vector v = new Vector();

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add("aaa");
        v.add("bbb");
        v.add("ccc");

        Enumeration en = v.elements();

        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

    }
}
