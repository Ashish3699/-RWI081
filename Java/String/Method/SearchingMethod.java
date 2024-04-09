package String.Method;

public class SearchingMethod {
    public static void main(String[] args) {
        String s = "Ashish Patel";

        System.out.println(s.indexOf('i'));
        System.out.println(s.indexOf("ish"));
        System.out.println(s.lastIndexOf('i'));
        System.out.println(s.lastIndexOf("sh"));
        System.out.println(s.charAt(10));
        System.out.println(s.contains("o"));
        System.out.println(s.startsWith("A"));
        System.out.println(s.endsWith("h"));

    }
}
