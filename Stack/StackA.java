package Stack;

import java.util.*;
// Implementation of stack using array list

public class StackA {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // Checking stack is empty or not
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public static void Push(int data) {
            list.add(data);
        }

        // Pop
        public static int Pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        public static int Peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.Push(0);
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);
        s.Push(5);

        while (!s.isEmpty()) {
            System.out.println(s.Peek());
            s.Pop();
        }
    }
}
