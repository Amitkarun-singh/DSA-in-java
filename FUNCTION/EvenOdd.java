package FUNCTION;
import java.util.Scanner;

public class EvenOdd {
    public static int Even(int n){
      if(n%2 == 0){
           System.out.println(n +" is even number");
      }else{
        System.out.println(n +" is odd number");
      }
       return n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Even(n);
    }
}
