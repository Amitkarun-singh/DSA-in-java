package RECURSION;

import java.util.*;

public class Power {
    public static int Power(int n, int x) {
        if (x == 0) {
            return 1;
        }
        return n * Power(n, x - 1);
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
