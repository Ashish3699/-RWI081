package Array1;

public class largestElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 5, 4, 6, 7, 7, 6, 5, 4, 4, 6, 7, 8, 9, 9, 5, 4, 2};

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("This is leargest element :-  " + max);
    }


}
