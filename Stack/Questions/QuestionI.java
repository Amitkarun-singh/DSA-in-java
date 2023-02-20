package Stack.Questions;

import java.util.*;
// Push at the bottom of the stack

public class QuestionI {
    public static void PushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        PushBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
