package RECURSION;

import java.util.*;

public class CheckSortArray {
    public static boolean CheckSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return CheckSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(CheckSorted(arr, 0));
    }
}
