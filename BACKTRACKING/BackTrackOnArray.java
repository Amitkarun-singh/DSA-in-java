package BACKTRACKING;

public class BackTrackOnArray {
    public static void ChangeArray(int arr[], int index, int value) {
        if (index == arr.length) {
            printArray(arr);
            return;
        }
        arr[index] = value;
        ChangeArray(arr, index + 1, value + 1);
        arr[index] = arr[index] - 2;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        ChangeArray(arr, 0, 1);
        printArray(arr);
    }

}
