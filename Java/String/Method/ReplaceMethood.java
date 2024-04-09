package String.Method;

public class ReplaceMethood {
    public static void main(String[] args) {
        String s = "this is String type data";

        System.out.println(s.replace("String","Char"));
        System.out.println(s.replaceAll("is","was"));
        System.out.println(s.replaceFirst("is","was"));
        System.out.println(s.replaceAll("is(.)","was"));
        System.out.println(s.replaceAll("is(.*)","was"));
    }
}
