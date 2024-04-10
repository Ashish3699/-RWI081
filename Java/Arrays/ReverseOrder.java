package Array1;

public class ReverseOrder {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int rev[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[i] = arr[i];
            System.out.print(rev[i] + " ");
        }
    }
}
