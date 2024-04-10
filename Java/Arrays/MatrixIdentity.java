package Array1;

public class MatrixIdentity {
    public static void main(String[] args) {
        int arr[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int row, col;
        boolean flag = true;

        row = arr.length;
        col = arr[0].length;

        if (row != col) {
            System.out.println("Matric should be not Squre");

        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {

                    if (i == j && arr[i][j] != 1) {
                        flag = false;
                        break;
                    }
                    if (i != j && arr[i][j] != 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println("Given matrix is an identity matrix");
            }else{
                System.out.println("Given matrix is not an identity matrix");
            }
        }
    }
}


