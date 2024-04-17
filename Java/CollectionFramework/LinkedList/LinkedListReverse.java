package CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");


        //Traversing the list of elements in reverse order
        Iterator i = list.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
