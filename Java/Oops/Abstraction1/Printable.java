public interface Printable{
    void print();
}

class showeable implements Printable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");    }

    public static void main(String args[]){
        showeable obj = new showeable();
        obj.print();
        obj.show();
    }
}