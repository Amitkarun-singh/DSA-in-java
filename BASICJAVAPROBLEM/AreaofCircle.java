package BASICJAVAPROBLEM;

//Calculate area of circle
import java.util.Scanner;

public class AreaofCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle :-");
        float Radius = sc.nextFloat();
        final float PI = 3.14F;
        float Area = PI * Radius * Radius;
        System.out.println("The area of given circle is :-" + Area);

    }
}
