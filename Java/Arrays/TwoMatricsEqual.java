package Array2;

public class TwoMatricsEqual {
    public static void main(String[] args) {
        int arr1[][] = {{1, 2, 3}, {4, 6, 6}, {7, 8, 9}};
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int row1, row2, col1, col2;
        boolean flag = true;
        row1 = arr1.length;
        row2 = arr2.length;
        col1 = arr1[0].length;
        col2 = arr2[0].length;

        if (row1 != row2 || col1 != col2) {
            System.out.println("Matrics is not equals");
        } else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    if (arr1[i][j] != arr2[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println("Matrix is equals");
            } else {
                System.out.println("Matrix is not equls");
            }

        }
    }
}
