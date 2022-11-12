package Arrays;

import java.util.*;

public class KadanesSub {
    public static void KadanesSubArray(int number[], int size) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            current_sum += number[i];
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println("Our maximun subarray sum is:-" + max_sum);
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
        KadanesSubArray(number, size);
    }
}
