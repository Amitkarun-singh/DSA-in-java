package FUNCTION;
import java.util.Scanner;

public class GCD {
    public static void GreatestCommonDivisor(int num1, int num2){
        int gcd;
        for(int i=1; i<=num1 || i<=num2; ++i){
            if(num1%i==0 && num2%i==0){ /* Checking whether i is a factor of both number */
            gcd=i;
            System.out.print("GCD of "+ num1 + " and " + num2 +" is "+ gcd +"\n");
             }
    }}
    public static void main(String args[]){
        int num1, num2;
        System.out.print("Enter two integers: ");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        num2= sc.nextInt();
        GreatestCommonDivisor(num1, num2);
        
    } 

}

