package FUNCTION;
import java.util.Scanner;

public class vote {
    public static void eligible(int Age){
        if(Age>=18){
            System.out.println("Your are eligible to vote");
            }else
            {
                System.err.println("Your are not eligible to vote");
            }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:-");
        int Age = sc.nextInt();
        eligible(Age);
    }
}
