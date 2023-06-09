package Stack;

import java.util.*;

public class StackTwoQueue {

    // In this Implementation of Stack using two Queue. Push take O(n) time
    // complexity and pop and peek take O(1) time complexity
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q2.add(data);
                while (!q1.isEmpty()) {
                    q2.add(q1.remove());
                }
            } else {
                q1.add(data);
                while (!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
            }
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!!!");
                return -1;
            }
            int top = -1;
            // case1
            if (!q1.isEmpty()) {
                top = q1.remove();
            } else {// case2
                top = q2.remove();
            }
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!!!");
                return -1;
            }
            int top = -1;
            // case1
            if (!q1.isEmpty()) {
                top = q1.peek();
            } else {// case2
                top = q2.peek();
            }
            return top;
        }
    }
    /*
     * // In this Implementation of Stack using two Queue. Push take O(1) time
     * // complexity and pop and peek take O(n) time complexity
     * static class Stack {
     * static Queue<Integer> q1 = new LinkedList<>();
     * static Queue<Integer> q2 = new LinkedList<>();
     * 
     * public static boolean isEmpty() {
     * return q1.isEmpty() && q2.isEmpty();
     * }
     * 
     * // push
     * public static void push(int data) {
     * if (!q1.isEmpty()) {
     * q1.add(data);
     * } else {
     * q2.add(data);
     * }
     * }
     * 
     * // pop
     * public static int pop() {
     * if (isEmpty()) {
     * System.out.println("Stack is empty!!!");
     * return -1;
     * }
     * int top = -1;
     * 
     * // case1
     * if (!q1.isEmpty()) {
     * while (!q1.isEmpty()) {
     * top = q1.remove();
     * if (q1.isEmpty()) {
     * break;
     * }
     * q2.add(top);
     * }
     * } else {// case2
     * while (!q2.isEmpty()) {
     * top = q2.remove();
     * if (q2.isEmpty()) {
     * break;
     * }
     * q1.add(top);
     * }
     * }
     * return top;
     * }
     * 
     * // peek
     * public static int peek() {
     * if (isEmpty()) {
     * System.out.println("Stack is empty!!!");
     * return -1;
     * }
     * int top = -1;
     * 
     * // case1
     * if (!q1.isEmpty()) {
     * while (!q1.isEmpty()) {
     * top = q1.remove();
     * q2.add(top);
     * }
     * } else {// case2
     * while (!q2.isEmpty()) {
     * top = q2.remove();
     * q1.add(top);
     * }
     * }
     * return top;
     * }
     * }
     */

    public static void main(String[] args) {
        Stack s = new Stack();
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
