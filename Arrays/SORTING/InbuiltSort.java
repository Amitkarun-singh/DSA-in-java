package Arrays.SORTING;

import java.util.*;

public class InbuiltSort {
    public static void Print(int number[], int size) {
        System.out.print("Array after sorting is:- ");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.print("Enter the element of array:-");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        Print(number, size);
    }
}
