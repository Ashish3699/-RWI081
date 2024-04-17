package Array2;

public class MatrixFindOddEvenElement {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row,col,evenCount =0,oddCount=0;
        row= arr.length;
        col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]%2==0){
                    evenCount++;
                }else {
                 oddCount++;
                }
            }
        }
        System.out.print("Tatal even Element -:"+evenCount);
        System.out.println();
        System.out.print("Total odd Element -:"+oddCount);
    }
}