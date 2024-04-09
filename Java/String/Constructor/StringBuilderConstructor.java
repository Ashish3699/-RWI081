package String.Constructor;

public class StringBuilderConstructor {
    public static void main(String[] args) {

        //StringBuilder is mutable
        //StringBuilder Constructor
        StringBuilder sb = new StringBuilder("Ashish Patel");

        //convert in immutable
        String s = new String(sb);
        if (s.length()!=0){
            System.out.println("This is a StringBuilder Constructor");
        }else{
            System.out.println("This is not StringBuilder Constructor");
        }
    }
}
