package RECURSION;

import java.util.*;

public class IncNumber {
    public static void print(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n = sc.nextInt();
        print(n);
    }
}
