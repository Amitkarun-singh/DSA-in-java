package Arrays.SORTING;

import java.util.*;

public class MergeSort {
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
        int mid = si + ((ei - si) / 2);
        Sort(arr, si, mid);
        Sort(arr, mid + 1, ei);
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
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
