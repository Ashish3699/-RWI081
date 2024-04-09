package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {2, 45, 345, 25, 7, 8, 90, 35, 765, 4, 78, 55, 4, 7, 4, 88, 1};
        int min, temp;
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
