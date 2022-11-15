package BASICJAVAPROBLEM;

//Print table of any number
import java.util.Scanner;

public class Table {
  public static void main(String args[]) {
    System.out.print("Enter any number to print it table :-");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("The table of " + num + " is :-");
    System.out.println(1 * num);
    System.out.println(2 * num);
    System.out.println(3 * num);
    System.out.println(4 * num);
    System.out.println(5 * num);
    System.out.println(6 * num);
    System.out.println(7 * num);
    System.out.println(8 * num);
    System.out.println(9 * num);
    System.out.println(10 * num);
  }
}
