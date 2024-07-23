package Hashing.HashMap;

import java.util.HashMap;

public class BasicOperaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert -O(1)
        map.put("India", 150);
        map.put("China", 100);
        map.put("US", 50);

        // Printing hashmap
        System.out.println(map);

        // get -O(1)
        int population = map.get("India");
        System.out.println(population);
        System.out.println(map.get("UK")); // if key dose not exist it return null

        // ContainsKey -O(1)
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("UK"));

        // Remove -O(1)
        System.out.println(map.remove("China")); // return the value of key also
        System.out.println(map);
        System.out.println(map.remove("UK"));

        // size()
        System.out.println(map.size());

        // IsEmpty()
        System.out.println(map.isEmpty());

        // clear()
        map.clear();
        System.out.println(map.isEmpty());
    }
}
