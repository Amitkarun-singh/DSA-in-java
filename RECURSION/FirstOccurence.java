package RECURSION;

import java.util.*;

public class FirstOccurence {
    public static int FirstOccur(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOccur(arr, key, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int n = sc.nextInt();
        System.out.print("Enter the array:-");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key:-");
        int key = sc.nextInt();
        System.out.println(FirstOccur(arr, key, 0));
    }
}
