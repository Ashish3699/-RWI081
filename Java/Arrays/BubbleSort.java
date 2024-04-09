package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9, 4, 7, 98, 43, 22, 5, 7, 88, 54, 4, 333, 44, 347, 7};
        int temp;
        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
