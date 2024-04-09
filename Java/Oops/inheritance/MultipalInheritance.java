package com.mycompany.oops.inheritance;

interface One {

    public void even();
}

interface Two {

    public void odd();
}

interface Three extends One, Two {

    @Override
    public void even();
}

class Child implements Three {

    @Override
    public void even() {
        System.out.println("Geeks");
    }

    @Override
    public void odd() {
        System.out.println("for");
    }
}

// Drived class
public class MultipalInheritance {

    public static void main(String[] args) {
        Child c = new Child();
        c.even();
        c.odd();
        c.even();
    }
}
