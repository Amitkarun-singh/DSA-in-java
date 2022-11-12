package Arrays;

import java.util.*;

public class Sub {
  public static void SubArray(int number[], int size) {
    System.out.println("The sub in your array is:-");
    int Total_Sun_Array = 0;
    for (int i = 0; i < size; i++) {
      for (int j = i; j < size; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          System.out.print(number[k] + " ");
          sum = sum + number[k];
        }
        Total_Sun_Array++;
        System.out.println();
        System.out.println("The sum of subarray is:-" + sum);
      }
      System.out.println();
    }
    System.out.println("Total sub array is:-" + Total_Sun_Array);
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
    SubArray(number, size);
  }
}
