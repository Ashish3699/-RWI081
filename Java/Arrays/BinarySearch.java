package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int Searchitem = 8;
        int lowerIndex = 0;
        int higherIndex = a.length - 1;


        while (lowerIndex <= higherIndex) {

            int midValue = (lowerIndex + higherIndex) / 2;

            if (a[midValue] == Searchitem) {

                System.out.println("Element is it" + midValue);

                break;
            } else if (a[midValue] < Searchitem) {

                lowerIndex = midValue + 1;

            } else {
                higherIndex = midValue - 1;

            }

        }
    }
}