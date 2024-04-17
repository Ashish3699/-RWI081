package Array2;

public class MatrixUpperTriangular {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4,5,6}, {7,8,9}};
        int row, col;

        row = arr.length;
        col = arr[0].length;

        if (row != col) {
            System.out.println("Matrix should be a square matrix");
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i>j){
                        System.out.print("0 ");
                    }else {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}