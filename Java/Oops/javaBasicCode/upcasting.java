package javacode;

class Bike {

    int a = 10;

    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {

    int a = 19;

    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {
        Bike b = new Splendor();//upcasting  
        b.run();
    }
}
