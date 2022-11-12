//Make a Calculator
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:-");
        int num = sc.nextInt();
        System.out.print("Enter second number:-");
        int num1 = sc.nextInt();
        int sum;
        System.out.println("1 : + (Addition) a + b");
        System.out.println("2 : - (Subtraction) a - b");
        System.out.println("3 : * (Multiplication) a * b");
        System.out.println("4 : / (Division) a / b");
        System.out.println("5 : % (Modulo or remainder) a % b");
        System.out.print("Enter the operation which you want to perform:-");
        int operation = sc.nextInt();
        switch(operation){
        case 1:
        sum = num + num1;
        System.out.println("The sum of two number is:-"+ sum); 
        break;
        case 2:
        sum = num - num1;
        System.out.println("The Subtraction of two number is:-"+ sum);
        break;
        case 3:
        sum = num * num1;
        System.out.println("The Multiplication of two number is:-"+ sum);
        break;
        case 4:
        sum = num / num1;
        System.out.println("The Division of two number is:-"+ sum);
        break;
        case 5:
        sum = num % num1;
        System.out.println("The Modulo of two number is:-"+ sum);
        break;
        default:
        System.out.println("Invalid operation");
        }
    }    
}
