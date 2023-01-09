package BACKTRACKING;

import java.util.*;

public class Permutation {
    // permutation=n!
    // timecomplexity:-O(n*n!)
    public static void FindPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            FindPermutation(newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string to find it permutation:-");
        String str = sc.next();
        FindPermutation(str, "");
    }
}
