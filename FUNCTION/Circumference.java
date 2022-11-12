package FUNCTION;
import java.util.Scanner;

public class Circumference {
    public static Float Circle(Float Radius){
       final float PI = 3.14F;
       float Circumference = 2*PI * Radius;
       return Circumference;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle :-");
        float Radius = sc.nextFloat();
        System.out.println("The circumference of given circle is :-" + Circle(Radius) );
    }
}
