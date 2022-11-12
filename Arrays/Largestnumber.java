package Arrays;

import java.util.*;

public class Largestnumber {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("The largest number in your is:-" + largest);
        System.out.println("The smallest number in your is:-" + smallest);
        return largest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter the elements of array:-");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        getLargest(number);
    }
}
