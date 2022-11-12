//Print sum of n natural number 
import java.util.Scanner;

public class SumNaturalno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any natural number to calculate it sum:-");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
          sum = sum + i;
        }
        System.out.println("The sum of " + n +" nautral number is:-"+ sum);
    }
}
