package FUNCTION;
import java.util.Scanner;

public class PrimeNumber {
    public static int Prime(int n){
        boolean isprime = true;
       for(int i=2; i<=n/2; i++){
        if(n%i == 0){
            isprime = false;
            break ;
        }
    }
        if(isprime) {
            if(n == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }
       return n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any number to find the sum of odd number:-");
        int n = sc.nextInt();
        Prime(n);
    }
}
