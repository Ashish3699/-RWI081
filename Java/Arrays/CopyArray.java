package Array1;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" "+arr1[i]);
        }
    }

}
