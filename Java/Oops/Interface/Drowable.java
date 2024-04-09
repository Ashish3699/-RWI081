package Interface;

public interface Drowable {
    void Drow();
}

class rectangle implements Drowable {
    @Override
    public void Drow() {
        System.out.println("drowing rectangle");
    }
}

class Circle implements Drowable {
    public void Drow() {
        System.out.println("drowing Cricle");
    }

    public static void main(String[] args) {
        Drowable d = new Circle();
        d.Drow();

        Drowable d1 = new rectangle();
        d1.Drow();
    }
}
