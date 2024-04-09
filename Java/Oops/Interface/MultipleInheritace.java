package Interface;

interface Printable1 {
    void print();
}

interface Showable {
    void print();
}

class Interface3 implements Printable1, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        Interface3 obj = new Interface3();
        obj.print();
    }
}