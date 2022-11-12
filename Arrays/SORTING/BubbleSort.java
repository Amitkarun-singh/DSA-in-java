package Arrays.SORTING;

import java.util.*;

public class BubbleSort {
    public static void Bubble(int number[], int size) {
        for (int turn = 0; turn < size - 1; turn++) {
            Boolean swapped = false;
            for (int j = 0; j < size - 1 - turn; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
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
        Bubble(number, size);
        Print(number, size);
    }
}
