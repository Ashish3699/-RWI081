package Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] a={10,20,30};
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]+" ");
        }
        for (int i:a) {
            System.out.println("For each loop : "+i);
        }
    }
}
