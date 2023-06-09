package Queue;

import java.util.*;

public class QueueC {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); // ArrayDeque
        // or
        // Queue<Integer> q = new ArrayDeque<>(); // LinkedList
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
