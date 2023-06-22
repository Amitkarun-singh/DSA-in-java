package GreedyAlgorithm;

import java.util.*;

// Fractional Knapsack O(nlogn)
/* Given the weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value  in the knapsack.
   
    value=[60, 100, 120]       ans = 240
    weight=[10, 20, 30]
    W = 50
 */
public class fractionalKnapsack {
    public static void main(String[] args) {
        int values[] = { 60, 100, 120 };
        int weights[] = { 10, 20, 30 };
        int W = 50;
        double maxProfit = 0;

        // capacity
        int capacity = W;
        double ratio[][] = new double[values.length][2];
        for (int i = 0; i < values.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i] / (double) weights[i];
        }

        // Sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for (int i = values.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (capacity >= weights[index]) {
                maxProfit += values[index];
                capacity -= weights[index];
            } else {
                maxProfit += capacity * ratio[i][1];
                capacity = 0;
                break;
            }
        }

        System.out.println("Maximum profit is:-" + maxProfit);
    }
}
