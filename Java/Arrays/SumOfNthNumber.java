package Array2;

import java.util.Scanner;

public class SumOfNthNumber {
    public static void main(String[] args) {

        int sum=0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i>=0) {
                sum += i;
            }else{
                System.out.println("Plaease enter positive number");
            }
        }
        System.out.println("sum of 1 to "+number+" is "+sum);
    }
}
