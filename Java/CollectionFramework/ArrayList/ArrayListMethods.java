package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ashish");
        list.add(0, "Shivam");
        list.add("Pratyoosh");
        list.add("Shubham");

//Add method
        list.add("Mangal");
        list.add(null);
        list.add(null);

//Contains method
        System.out.println("-------------Contains method-------------------");
        System.out.println(list.contains("Shubham"));

//remove method
        list.remove("Shubham");

//get method
        System.out.println("------------------get method-----------------");
        System.out.println(list.get(3));

//set method
        System.out.println("------------------set method----------------------");
        System.out.println(list.set(3, "Satna "));

// indexof method
        System.out.println("-----------------indexof method--------------------");
        System.out.println(list.indexOf(5));

//Add All method
        System.out.println("--------------------------Add All method---------------------------");
        ArrayList<String> list1 = new ArrayList<String>();
        list1.addAll(list);
        list1.add("Shiv");
        for (String List : list1) {
            System.out.println(List);
        }
//remove all method
        System.out.println("-----------------------remove all method---------------------------");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Shubham");
        list2.add("Mangal");
        list.removeAll(list2);

        for (String li : list
        ) {
            System.out.println(li);
        }

    }
}
