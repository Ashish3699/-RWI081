package Array1;

public class MatrixSparce {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 0}, {0, 2, 2}, {0, 2, 0}};
        int row, col, size;
        int count = 0;
        row = arr.length;
        col = arr[0].length;
        size = row * col;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }
        }
        if (count > (size / 2)) {
            System.out.println("Given matrix is a sparse matrix");
        } else {
            System.out.println("Given matrix is not a sparse matrix");
        }


    }
}
