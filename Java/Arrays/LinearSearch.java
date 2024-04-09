package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7,8,9};
        int item= 18;
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==item){
                System.out.println("index number :"+a[i]);
                temp=1;
            }
        }if (temp==0){
            System.out.println("itme is not in this arr");
        }
    }
}
