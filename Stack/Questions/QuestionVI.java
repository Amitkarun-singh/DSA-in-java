package Stack.Questions;

import java.util.*;

//Valid Parenthese

public class QuestionVI {
    public static boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == '(') || (ch == '[') || (ch == '{')) {
                valid.push(ch);
            } else {
                if (valid.isEmpty()) {
                    return false;
                }
                if ((valid.peek() == '(' && ch == ')') ||
                        (valid.peek() == '[' && ch == ']') ||
                        (valid.peek() == '{' && ch == '}')) {
                    valid.pop();
                } else {
                    return false;
                }
            }
        }
        if (!valid.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "(({})[]";
        System.out.println(isValid(str));
    }
}
