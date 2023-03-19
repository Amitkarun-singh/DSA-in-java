package Stack.Questions;

import java.util.*;
// Stock Span Problem

public class QuestionIV {
    public static void stockSpan(int Stock[], int Span[]) {
        Stack<Integer> s = new Stack<>();
        Span[0] = 1;
        s.push(0);
        for (int i = 1; i < Stock.length; i++) {
            int currprice = Stock[i];
            while (!s.isEmpty() && currprice >= Stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                Span[i] = i + 1;
            } else {
                int prevhigh = s.peek();
                Span[i] = i - prevhigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int Stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int Span[] = new int[Stock.length];
        stockSpan(Stock, Span);
        for (int i = 0; i < Span.length; i++) {
            System.out.print(Span[i] + " ");
        }
    }
}
