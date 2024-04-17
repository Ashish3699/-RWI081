package CollectionFramework.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIterator {
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add(1);
        li.add(7);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add("Ashish");
        li.add("Patel");
        Iterator  itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
