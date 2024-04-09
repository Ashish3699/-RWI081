package String.Method;

public class EqualsOperator {
    public static void main(String[] args) {
        String s1 =  new String("Ashish");
        String s2 =  new String("Ashish");
        if (s1==s2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        String s3 = "Patel";
        String s4=  "Patel";
        if (s3==s4){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
