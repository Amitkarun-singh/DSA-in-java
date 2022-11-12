import java.util.Scanner;

public class Number {
    static int num;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        int count=0;
        int rev=0;
        int digit=0;
        boolean i=true;
        while(i){
        System.out.println("Enter:-1.for entering another number. 2.for stop");
        choice = sc.nextInt();
        switch(choice){
            case 1:System.out.print("Enter the number:-");
                   num = sc.nextInt();
                   if(num<0){
                    count++;
                }
                if(num==0){
                    digit++;
                }
                if(num>0){
                    rev++;
                }
                   break;
            case 2:i=false;
            System.out.println("The number of positive number you have enter:-"+rev);
            System.out.println("The number of Zeros you have enter:-"+digit);
            System.out.println("The number of Negative number you have enter:-"+count);
                   break;
            default:System.out.println("Thanku you");
                    break;
        }
        }     
    }
}
