package TWODArray;

import java.util.*;

public class Creation {
    public static void Search(int matrix[][], int key) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key is found at index (" + i + " " + j + ")");
                }
                largest = Math.max(largest, matrix[i][j]);
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.print("The largest element in your matrix is:-" + largest);
        System.out.println();
        System.out.print("The smallest element in your matrix is:-" + smallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want:-");
        int n = sc.nextInt();
        System.out.print("Enter the number of column you want:-");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        // Input
        System.out.println("Enter the element of 2D array:-");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element which you want to find:-");
        int key = sc.nextInt();
        // Output
        System.out.println("The element you have entered in 2D array:-");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Search(matrix, key);
    }
}
