package Arrays;

import java.util.*;

public class Pairs {
    public static void PairArray(int number[], int size) {
        System.out.println("The pair in your array is:-");
        int Total_pairs = 0;
        for (int i = 0; i < size; i++) {
            int current = number[i];
            for (int j = i + 1; j < size; j++) {
                System.out.print("(" + current + "," + number[j] + ")");
                Total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs is:-" + Total_pairs);
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
        PairArray(number, size);
    }
}
