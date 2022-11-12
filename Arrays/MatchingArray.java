package Arrays;

import java.util.*;

public class MatchingArray {
    public static int CheckingArray(int number[], int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (number[i] == number[j]) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter the elements of array:-");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int index = CheckingArray(number, size);
        if (index == -1) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
