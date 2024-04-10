package Array1;

public class RotateLeft {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int set = 3;

        System.out.println("This is original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }

        //Rotate the given array by n times toward left
        for (int i = 0; i < set; i++) {
            int j,first;
            first=arr[0];

            //Stores the first element of the array
            for ( j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.print(" Ratate Array :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
