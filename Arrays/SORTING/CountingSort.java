package Arrays.SORTING;

import java.util.Scanner;

public class CountingSort {
    public static void Counting(int number[], int size) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            largest = Math.max(largest, number[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < size; i++) {
            count[number[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                number[j] = i;
                j++;
                count[i]--;
            }
        }
    }

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
        Counting(number, size);
        Print(number, size);
    }

}
