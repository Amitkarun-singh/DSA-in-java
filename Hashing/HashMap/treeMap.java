package Hashing.HashMap;

import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 150);
        tm.put("China", 100);
        tm.put("US", 50);

        System.out.println(tm);
    }
}
