package Arrays.SORTING;

import java.util.*;

public class QuickSort {
    public static void PrintArray(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = Partition(arr, si, ei);
        Sort(arr, si, pIdx - 1);
        Sort(arr, pIdx + 1, ei);
    }

    public static int Partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int n = sc.nextInt();
        System.out.print("Enter the element of array:-");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Sort(arr, 0, n - 1);
        PrintArray(arr, n);
    }
}
