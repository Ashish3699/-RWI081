package Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {9, 4, 7, 98, 43, 22, 5, 7, 88, 54, 4, 333, 44, 347, 7};
        int temp, j;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            j = i;
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
