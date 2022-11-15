package BASICJAVAPROBLEM;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number:-");
    int n = sc.nextInt();
    int temp;
    int num1 = 0;
    int num2 = 1;
    System.out.println(num1 + " ");
    System.out.println(num2 + " ");
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = num1 + num2;
      num1 = num2;
      num2 = sum;
      System.out.println(sum + " ");
    }
  }
}
