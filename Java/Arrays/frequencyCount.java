package Array1;

public class frequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 4, 1, 5, 6, 8, 5, 6, 4, 7, 3, 2, 6, 7, 8, 5, 3, 5, 7, 7, 5, 4, 56};
        int[] freqArray = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freqArray[j] = visited;
                }
            }
            if (freqArray[i] != visited) {
                freqArray[i] = count;
            }
        }
        for (int i = 0; i < freqArray.length; i++) {
            if (freqArray[i] != visited) {
                System.out.println(arr[i] + " | " + freqArray[i]);
            }
        }
    }
}
