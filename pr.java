import java.util.Scanner;

public class pr {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Scanner sc=new Scanner(System.in);
		int R = sc.nextInt();
		if ((R >= 1) && (R <= 50)) {
			System.out.println("100");
		} else if ((R <= 100) && (R >= 51)) {
			System.out.println("50");
		} else {
			System.out.println("0");
		}
	}
}
