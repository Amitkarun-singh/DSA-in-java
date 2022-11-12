package STRING;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("The entered string is not a palindrome");
                return false;
            }
        }
        System.out.println("The entered string is a palindrome");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:-");
        String str = sc.next();
        isPalindrome(str);
    }
}
