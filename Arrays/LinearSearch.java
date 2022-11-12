package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static int Search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int j = sc.nextInt();
        int number[] = new int[j];
        System.out.println("Enter the elements of array:-");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        System.out.print("Enter the element which you want to find:-");
        int key = sc.nextInt();
        int index = Search(number, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index:- " + index);
        }
    }
}
