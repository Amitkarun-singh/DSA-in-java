package FUNCTION;
import java.util.Scanner;

public class SumOdd {
    public static int Sum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
               sum = sum + i;
            }
        }
         return sum;
      }
      public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          System.out.println("The sum of all odd number till "+n+" is:- "+ Sum(n));
      }
}
