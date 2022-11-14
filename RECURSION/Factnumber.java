package RECURSION;

import java.util.*;

public class Factnumber {
    public static int PrintFact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = PrintFact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n = sc.nextInt();
        System.out.println(PrintFact(n));

    }

}
