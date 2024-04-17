package Array2;

public class ProductTwoMetrics {
    public static void main(String[] args) {
        int[] arr1[] = {{1,2,3},{4,5,6},{7,8,9}};
        int[] arr2[] = {{1,2,3},{4,5,6},{7,8,9}};

        int row1,row2,col1,col2;
        row1 = arr1.length;
        row2 = arr2.length;
        col1 = arr1[0].length;
        col2 = arr2[0].length;

        if (col1!=row2){
            System.out.println("Matrix cannot be multipied");
        }else {
          int  prod[][]=new int[row1][col2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        prod[i][j] += arr1[i][k]*arr2[k][j];
                    }
                }
            }
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print( prod[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
