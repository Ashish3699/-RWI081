package Array1;

public class ThirdLeargestElement {
    public static int ThirdLeargestElement(int a[], int arrlenth) {
        int temp = 0;
        for (int i = 0; i < arrlenth; i++) {
            for (int j = i+1; j < arrlenth; j++) {
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a[arrlenth-3];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = {11, 22, 33, 44, 55, 66, 77, 88, 99, 110};
        System.out.println("Third leargest Element "+ThirdLeargestElement(arr,10));
        System.out.println("Third leargest Element "+ThirdLeargestElement(arr1,10));
    }
}
