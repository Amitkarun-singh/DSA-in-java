package GreedyAlgorithm;

import java.util.*;

// Chocola Problem
/* we are given a bar of chocolate composed of mxn square pieces. One should break the chocolate into single squares. Each break of a part of the chocolate is charged a cost expressed by a positive integer.This cost does not depend on the part that is being broken but only depends on the line the break goes along.Let us denote the costs of breaking along consecutive vertical lines with x1, x2, ...., xm-1 and along horizontal lines with y1, y2, ....,yn-1. Compute the minimal cost of breaking the whole chocolate into single squares. */

public class chocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHer[] = { 4, 1, 2 };

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHer, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHer.length && v < costVer.length) {
            if (costVer[v] <= costHer[h]) {
                cost += (costHer[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costHer.length) {
            cost += (costHer[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("min cost to cuts = " + cost);
    }
}
