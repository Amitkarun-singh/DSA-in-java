package BitManipulation;

import java.util.*;

public class OddEven {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println(n + " is a even number");
        } else {
            System.out.println(n + " is a odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n = sc.nextInt();
        oddEven(n);
    }
}
