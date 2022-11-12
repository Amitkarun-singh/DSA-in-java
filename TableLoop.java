//Print table of n given number 
import java.util.Scanner;

public class TableLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to print it's table:-");
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println("The table of " + n +" is "+ n +"X"+ i +":-"+ n*i);
        }
    }
}
