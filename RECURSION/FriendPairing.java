package RECURSION;

import java.util.*;

public class FriendPairing {
    public static int FriendPair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return FriendPair(n - 1) + (n - 1) * FriendPair(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:-");
        int n = sc.nextInt();
        System.out.println(FriendPair(n));
    }
}
