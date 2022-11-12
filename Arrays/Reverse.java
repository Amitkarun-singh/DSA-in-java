package Arrays;

import java.util.*;

public class Reverse {
    public static void ReverseArray(int number[], int size) {
        int start = 0;
        int end = size - 1;
        while (start < end) {
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;

            start++;
            end--;
        }

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
        ReverseArray(number, size);
        System.out.println("Reverse of array is:-");
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }

    }

}
