package BASICJAVAPROBLEM;

//Check whether number is Odd or Even
import java.util.Scanner;

public class OddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:-");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("You have enter an even number");
        } else {
            System.err.println("You have enter an odd number");
        }
    }
}
