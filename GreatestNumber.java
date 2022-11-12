//Evaluate the two number
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:-");
        int num = sc.nextInt();
        System.out.print("Enter second number:-");
        int num1 = sc.nextInt();
        if(num == num1){
        System.out.println("The two number are equal");
        }
        else if(num > num1)
        {
            System.err.println(num + " is greater then " + num1);
        }
        else 
        {
            System.out.println(num + " is lesser then " + num1);
        }
    }
}
