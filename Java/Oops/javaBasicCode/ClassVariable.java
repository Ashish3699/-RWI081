package javacode;

public class ClassVariable {

    // instance Fields
    int id;
    String name;

    //constructor
    ClassVariable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Static bolck
    static {
        String company = "Railworld";
        System.out.println(company);
    }

    //method
    void print() {
        System.out.println("Id :-"+id + "Name :-"+name);
    }

    //Main methode
    public static void main(String[] args) {
        ClassVariable cv = new ClassVariable(101, "Ashish");
        cv.print();

    }
}
