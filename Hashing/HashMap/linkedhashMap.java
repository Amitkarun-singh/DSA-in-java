package Hashing.HashMap;

import java.util.*;

public class linkedhashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 150);
        lhm.put("China", 100);
        lhm.put("US", 50);

        System.out.println(lhm);
    }
}
