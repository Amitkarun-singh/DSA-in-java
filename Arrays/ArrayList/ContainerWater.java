package Arrays.ArrayList;

import java.util.*;

public class ContainerWater {
    // brute force:-O(n^2)
    /*
     * public static int StoreWater(ArrayList<Integer> height) {
     * int maxwater = 0;
     * for (int i = 0; i < height.size(); i++) {
     * for (int j = i + 1; j < height.size(); j++) {
     * int ht = Math.min(height.get(i), height.get(j));
     * int width = j - i;
     * int currentWater = ht * width;
     * maxwater = Math.max(maxwater, currentWater);
     * }
     * }
     * return maxwater;
     * }
     */
    // 2 Pointer Approach:-O(n)
    public static int StoreWater(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currentWater = ht * width;
            maxwater = Math.max(maxwater, currentWater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(StoreWater(height));
    }
}
