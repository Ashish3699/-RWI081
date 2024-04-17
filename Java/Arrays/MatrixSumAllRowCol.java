package Array2;

public class MatrixSumAllRowCol {
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int row,col,sumRow=0,sumCol=0;
        row = arr.length;
        col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumRow +=arr[i][j];
            }
            System.out.println("Sum od "+(i+1)+" row "+sumRow);
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                sumCol +=arr[j][i];
            }
            System.out.println("Sum od "+(i+1)+" col "+sumCol);
        }
    }
}
