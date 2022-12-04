package RECURSION;

import java.util.*;

public class TilingProblem {
    public static int Tiling(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        }
        return Tiling(n - 1) + Tiling(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:-");
        int n = sc.nextInt();
        System.out.println(Tiling(n));
    }
}
