package Arrays.SORTING;

import java.util.*;;

public class SelectionSort {
    public static void Selection(int number[], int size) {
        for (int turn = 0; turn < size - 1; turn++) {
            int minPos = turn;
            for (int j = turn + 1; j < size; j++) {
                if (number[minPos] > number[j]) {
                    minPos = j;
                }
            }
            int temp = number[minPos];
            number[minPos] = number[turn];
            number[turn] = temp;
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
        Selection(number, size);
        Print(number, size);
    }
}
