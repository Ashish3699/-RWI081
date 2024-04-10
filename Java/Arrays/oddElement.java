package Array1;

public class oddElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 34, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("EvenElement");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("Odd Element");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

