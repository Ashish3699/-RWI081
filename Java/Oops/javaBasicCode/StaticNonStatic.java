package javacode;

public class StaticNonStatic {

    public static void print() {
        System.out.println("Static variable");
    }
// Static block

    static {
        System.out.println("Ashish");
    }
// Non-Static block

    {
        System.out.println("Patel");
    }

    public void print1() {
        System.out.println("Static variable1");
    }

    public static void main(String[] args) {

        StaticNonStatic p = new StaticNonStatic();
        p.print1();
        StaticNonStatic.print();
    }

}
