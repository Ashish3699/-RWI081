package String.Method;


//isEmpty method not working null value
//if we are givng null values program given NullPointerException

public class StringisEmptyMethod {
    public static void main(String[] args) {
        String name  = "Ashish Patel";
        String email = "Rpashishpatel221@gmail.com";
        String password = "581548";
       if (name.isEmpty()==true){
           System.out.println("Please fill your Name");
       }else {
           System.out.println("Name :- "+name);
       }
        if (email.isEmpty()==true){
            System.out.println("Please fill your Email");
        }else {
            System.out.println("Email :- "+email);
        }
        if (password.isEmpty()==true){
            System.out.println("Please fill your Password");
        }else {
            System.out.println("Password :- "+password);
        }
    }
}
