package Arrays;

import java.util.*;

public class ModifiedBinarySearch {
    public static int Search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return Search(arr, tar, si, mid - 1);
            } else {
                return Search(arr, tar, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return Search(arr, tar, mid + 1, ei);
            } else {
                return Search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int n = sc.nextInt();
        System.out.print("Enter the element of array:-");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target:-");
        int target = sc.nextInt();
        int tarIdx = Search(arr, target, 0, n - 1);
        System.out.println(tarIdx);
    }
}
