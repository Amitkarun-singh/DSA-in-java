package Arrays;

import java.util.*;

public class PrifixSubSum {
    public static void PrifixSubArray(int number[], int size) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int Prifix[] = new int[size];
        Prifix[0] = number[0];
        for (int i = 1; i < size; i++) {
            Prifix[i] = Prifix[i - 1] + number[i];
        }
        for (int i = 0; i < size; i++) {
            int start = i;
            for (int j = i; j < size; j++) {
                int end = j;
                current_sum = start == 0 ? Prifix[end] : Prifix[end] - Prifix[start - 1];
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
        PrifixSubArray(number, size);
    }
}
