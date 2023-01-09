package BACKTRACKING;

import java.util.*;

public class Subset {
    // total number of suset of n element=2^n
    public static void FindSet(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        FindSet(str, ans + str.charAt(i), i + 1);
        FindSet(str, ans, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string to find it subset:-");
        String str = sc.next();
        FindSet(str, " ", 0);
    }

}
