package Arrays;

import java.util.*;

public class BinarySearch {
    public static int Search(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = { 2, 4, 6, 8, 10, 12, 14 };
        System.out.print("Enter the element which you want to find:-");
        int key = sc.nextInt();
        int index = Search(number, key);
        if (index == -1) {
            System.out.println("The which you enter is not in array");
        } else {
            System.out.println("Key is at index:- " + index);
        }
    }
}
