package javacode;

public class StaticVariable {

    static int a = 10;

    public class innerClass {

        static int b = 20;
    }

    public static void main(String[] args) {

        System.out.println(innerClass.b);
        System.out.println(StaticVariable.a);

    }

}
