package String.Constructor;

public class StringBufferConstructor {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ashish Patel");
        String s = new String(sb);
        if (s.length()!=0){
            System.out.println("This is a StringBuffer Constructor");
        }else{
            System.out.println("This is not StringBuffer Constructor");
        }
    }
}
