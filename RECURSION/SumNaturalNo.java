package RECURSION;

import java.util.*;

public class SumNaturalNo {
    public static int NaturalSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + NaturalSum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n = sc.nextInt();
        System.out.println(NaturalSum(n));
    }
}
