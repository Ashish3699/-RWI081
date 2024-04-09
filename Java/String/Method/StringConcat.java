package String.Method;

public class StringConcat {
    public static void main(String[] args) {
        String s1 = "Ashish";
        String s2 = "Patel";
        System.out.println("User Full Name :-"+s1.concat(s2));
        System.out.println(String.join(":",s1,s2));
    }
}
