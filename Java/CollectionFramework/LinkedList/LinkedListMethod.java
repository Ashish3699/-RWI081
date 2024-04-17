package CollectionFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethod {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Madhya Pradesh");
        list.add("Maihar");

//Add method
        list.add("Jabalpur");
        list.add("Satna");
        list.add("Rewa");
        list.add("Indore");

//Remove method
        System.out.println("-------------------------------");
        for (String i : list
        ) {
            System.out.println(i);
        }

// Add all method
        LinkedList<String> list1 = new LinkedList<String>();
        System.out.println("-----------------------------------S");
        list1.addAll(list);

        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
