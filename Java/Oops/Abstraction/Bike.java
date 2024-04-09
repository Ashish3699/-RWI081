package Abstruction;


//abstract class that has abstract and non-abstract methods
abstract class Bike {
    Bike(){
        System.out.println("Bike is ready");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear Changed");
    }
}

// Child class which inherits Abstract class
class Honda extends Bike {
    @Override
    void run() {
        System.out.println("Bike is Honda");
    }
}

//AbstructionExample class which calls abstract and non-abstract methods

class AbstructionExample {

    public static void main(String[] args) {

        Bike h = new Honda();
        h.run();
        h.changeGear();

    }

}