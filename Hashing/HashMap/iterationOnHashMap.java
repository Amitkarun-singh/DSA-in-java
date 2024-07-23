package Hashing.HashMap;

import java.util.*;

public class iterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // Insert
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Indonesia", 6);
        map.put("Nepal", 5);

        // Iteration
        // map.entrySet() store data in key value pair

        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key = " + k + " ,value = " + map.get(k));
        }
    }
}
