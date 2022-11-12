package FUNCTION;
import java.util.Scanner;

public class Table {
    public static int Tables(int n){
        for(int i=1; i<=10; i++){
            System.out.println("Table of "+ n +"  is:- "+n*i);
        }
         return n;
      }
      public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          Tables(n);
      }
}
