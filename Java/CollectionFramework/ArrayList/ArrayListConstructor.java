package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class ArrayListConstructor {
    public static void main(String[] args) {

//Empty construnctor
        ArrayList al = new ArrayList();
        al.add(1);
        al.add("Ram");
        System.out.println(al);
        System.out.println("-----------------------------------------------");

// InitialCapcity constructor
        ArrayList al1 = new ArrayList(4);
        al1.add(1);
        al1.add("Ram");
        System.out.println(al1);
        System.out.println("==-----------------------------------------------------------");

// Collection c Constructor
        ArrayList al2 = new ArrayList(al);

        System.out.println(al2);

    }
}
