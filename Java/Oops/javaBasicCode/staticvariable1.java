package javacode;

public class staticvariable1 {

    String Name;
    String eId;
   static String CompanyName = "RailWorld";

    staticvariable1(String Name, String eId) {
       
        this.Name = Name;
        this.eId = eId;
    }

    void display() {
        System.out.print(Name + eId + CompanyName );
    }

    public static void main(String[] args) {
        staticvariable1 sv = new staticvariable1("Ashish", "A01");
        sv.display();
    }

}
