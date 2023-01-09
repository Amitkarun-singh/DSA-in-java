package BACKTRACKING;

import java.util.*;

public class GridWays {
    // time complexity=2^(n+m)
    // By using this formula we can sovle this problem in linear time complexity:-
    /*
     * ((n-1)+(m-1))!
     * ----------------
     * (n-1)!*(m-1)!
     */
    public static int gridWays(int n, int m, int i, int j) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }
        int w1 = gridWays(n, m, i + 1, j);
        int w2 = gridWays(n, m, i, j + 1);
        return w1 + w2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row:-");
        int n = sc.nextInt();
        System.out.print("Enter the number of cols:-");
        int m = sc.nextInt();
        System.out.println("The number of ways are:-" + gridWays(n, m, 0, 0));
    }
}
