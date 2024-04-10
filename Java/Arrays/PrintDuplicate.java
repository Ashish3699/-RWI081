package Array1;

public class PrintDuplicate {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,5,4,5,9,8,1,34,5,6,90};

        System.out.println("This is original Array :");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println("This is Duplicate element");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
