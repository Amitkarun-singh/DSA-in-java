package STRING;

import java.util.Scanner;

public class SubString {
    public static String subString(String str, int si, int ed) {
        String sub = "";
        for (int i = si; i < ed; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:-");
        String str = sc.next();
        System.out.println(str.substring(0, 5));
        System.out.println(subString(str, 0, 5));
    }
}
