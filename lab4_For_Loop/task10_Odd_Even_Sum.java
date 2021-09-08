package lab4_For_Loop;

import java.util.Scanner;

public class task10_Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (i % 2 != 0) {
                oddSum += num;
            } else {
                evenSum += num;
            }
        }
        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(oddSum - evenSum));
        }
    }
}
