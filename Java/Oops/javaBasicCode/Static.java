package javacode;

class Static {

    //non static class
    void display() {
        System.out.println("A non-static function is called.");
    }
    //static class

    static void cube() {
        int x = 7 * 7 * 7;
        System.out.println("Cube of 7 is: " + x);
    }
    //main method

    public static void main(String args[]) {
        Static obj = new Static();
        obj.display();
        cube();
    }
}
