package CollectionFramework.Iterator;


import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class ListIteratorExample {
    public static <Iterator> void main(String[] args) {


        List li = new ArrayList<>();
        li.add(1);
        li.add(7);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add("Ashish");
        li.add("Patel");

        ListIterator itr = li.listIterator();


        // Iterator in forword direction
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("---------------------------------------------------");


        //Iterator in backword direction

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
        System.out.println("-----------------------------------------------");


        // set(): - set the value

        li.set(3, "MP");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }


}
