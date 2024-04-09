package Interface;

interface Printable {
    void print();
}
class PrintValue implements Printable1 {
    @Override
    public void print() {
        System.out.println("Running Interface");
    }

    public static void main(String[] args) {
        PrintValue p = new PrintValue();
        p.print();
    }
}