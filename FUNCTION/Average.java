package FUNCTION;
import java.util.Scanner;

public class Average {
    public static int AverageNumber(int num1, int num2, int num3){
            int result = (num1 + num2 + num3)/3;
         return result;
      }
      public static void main(String args[]){
        System.out.println("Enter the three number to calculate there average");
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the first number:-");
          int num1 = sc.nextInt();
          System.out.print("Enter the second number:-");
          int num2 = sc.nextInt();
          System.out.print("Enter the third number:-");
          int num3 = sc.nextInt();
          float result = AverageNumber(num1, num2, num3);
          System.out.println("The Average of three number is:- "+ result);
      }
}
