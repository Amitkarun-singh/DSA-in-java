package Stack.Questions;

import java.util.*;

//Duplicate Parentheses

public class QuestionVII {
    public static boolean isDuplicate(String s) {
        Stack<Character> Duplicate = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (Duplicate.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;
                }
            } else {
                Duplicate.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str2));
    }
}
