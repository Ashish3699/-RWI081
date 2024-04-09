package String.Constructor;

public class StringEmptyConstructor {
    public static void main(String[] args) {

        //No argument Constructor
        String s = new String();
        if (s.length() == 0) {
            System.out.println("String is Empty");
        } else {
            System.out.println("String is not empty");
        }
    }
}
