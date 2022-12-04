package RECURSION;

public class BinaryString {
    public static void PrintBinString(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        PrintBinString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            PrintBinString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        PrintBinString(3, 0, "");
    }

}
