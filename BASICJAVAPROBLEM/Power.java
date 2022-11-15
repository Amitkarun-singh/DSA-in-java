package BASICJAVAPROBLEM;

import java.util.Scanner;

public class Power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number(x):-");
        int x = sc.nextInt();
        System.out.println("Enter another number(n):-");
        int n = sc.nextInt();
        int power = 1; // p stand for power i.e x^n
        if (n == 1) {
            power = x;
        } else {
            for (int i = 1; i <= n; i++) {
                power = power * x;

            }

        }
        System.out.println("This power of n raise to x:-" + power);
    }
}
