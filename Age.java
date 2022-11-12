
//Checking the the user is adult or not
import java.util.Scanner;

public class Age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:-");
        int Age = sc.nextInt();
        if (Age >= 18) {
            System.out.println("Your are Adult");
        } else {
            System.err.println("Your are not Adult");
        }
    }
}
