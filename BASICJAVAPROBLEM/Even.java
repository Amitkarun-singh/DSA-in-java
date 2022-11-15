package BASICJAVAPROBLEM;

//Print all even number till n 
import java.util.Scanner;

public class Even {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:-");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("The " + i + " is an even number ");
            }
        }
    }
}
