package Arrays;

import java.util.*;

public class MaxSumSub {
    public static void MaxSumSubArray(int number[], int size) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                current_sum = 0;
                for (int k = i; k <= j; k++) {
                    current_sum += number[k];
                }
                if (max_sum < current_sum) {
                    max_sum = current_sum;
                }
                System.out.println();
                System.out.println("The sum of subarray is:-" + current_sum);
            }
            System.out.println();
        }
        System.out.println("The largest sum of sub array is:-" + max_sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter the elements of array:-");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        MaxSumSubArray(number, size);
    }
}
