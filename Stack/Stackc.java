package Stack;

import java.util.*;
// Implementation of stack using JAVA collection framework

public class Stackc {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
