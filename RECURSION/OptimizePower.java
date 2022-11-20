package RECURSION;

import java.util.*;

public class OptimizePower {
    public static int Power(int n, int x) {
        if (x == 0) {
            return 1;
        }
        int halfpower = Power(n, x / 2);
        int halfpowersqr = halfpower * halfpower;
        if (x % 2 != 0) {
            halfpowersqr = n * halfpower * halfpower;
        }
        return halfpowersqr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:-");
        int n = sc.nextInt();
        System.out.print("Enter the power:-");
        int x = sc.nextInt();
        System.out.println(Power(n, x));
    }
}
