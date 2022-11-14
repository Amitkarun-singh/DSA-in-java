package RECURSION;

import java.util.*;

public class Fibonacci {
    public static int FiboNum(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        }
        int fib = FiboNum(n - 1) + FiboNum(n - 2);
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n = sc.nextInt();
        System.out.println(FiboNum(n));
    }
}
