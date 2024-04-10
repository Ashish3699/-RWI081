package Array1;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 5, 4, 6, 7, 7, 6, 5, 4, 4, 6, 7, 8, 9, 9, 5, 4, 2};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("This is Smallest element :-  " + min);
    }


}
