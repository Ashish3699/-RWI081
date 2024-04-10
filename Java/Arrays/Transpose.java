package Array1;

public class Transpose {
    public static void main(String[] args) {
        int original[][] = {{3, 2, 1}, {6, 5, 4},{9,8,7}};
        int transpose[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = original[i][j ];
            }
        }
        System.out.println("Original");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
