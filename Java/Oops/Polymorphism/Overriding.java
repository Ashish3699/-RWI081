package com.mycompany.oopa.Polymorphism;

public class Overriding extends OverLoading{

  @Override
  int add(int a, int b, int c) {
        return a * b + c;
    }
    
    public static void main(String[] args) {
        Overriding or = new Overriding();
        System.out.println(or.add(10, 10, 10));
    }
    
}
