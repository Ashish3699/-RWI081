package com.mycompany.oopa.Polymorphism;

public class OverLoading  {
 
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverLoading ol = new OverLoading();
        System.out.println(ol.add(10, 10, 10));

    }
}
