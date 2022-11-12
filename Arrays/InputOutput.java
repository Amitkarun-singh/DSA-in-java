package Arrays;

import java.util.*;

public class InputOutput {
    public static void main(String args[]) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays:-");
        int i = sc.nextInt();
        int marks[] = new int[i];
        System.out.println("Enter the element of Arrays:-");
        for (int j = 0; j < marks.length; j++) {
            marks[j] = sc.nextInt();
        }
        // Output
        System.out.println("Enter the element in Arrays is:-");
        for (int j = 0; j < marks.length; j++) {
            System.out.println(marks[j]);
        }

    }
}
