package Abstruction;

//this is abstruct class
abstract class Vehicle {

    //abstruct method
    abstract void start();
}
//inherit abstruc class
class Car extends Vehicle{
    //override abstruct method
    @Override
    void start() {
        System.out.println("this is car");
    }
}
class Scooter extends Vehicle{
    void start(){
        System.out.println("This is Scooter");
    }
    public static void main(String[] args){
        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
    }
}