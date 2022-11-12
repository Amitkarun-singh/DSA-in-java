package BitManipulation;

import java.util.*;

public class BitOperation {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newbit) {
        n = clearIthBit(n, i);
        int bitMask = newbit << i;
        return n | bitMask;
    }

    public static int clearALLIthBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearRangeIthBit(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerofTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int n, int a) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n = sc.nextInt();
        System.out.print("Enter the ith bit:-");
        int i = sc.nextInt();
        System.out.println(getIthBit(n, i));
        System.out.println(setIthBit(n, i));
        System.out.println(clearIthBit(n, i));
        System.out.println(updateIthBit(n, i, 1));
        System.out.println(clearALLIthBit(n, i));
        System.out.println(clearRangeIthBit(n, i, 5));
        System.out.println(isPowerofTwo(n));
        System.out.println(countSetBit(n));
        System.out.println(fastExpo(n, 5));
    }
}
