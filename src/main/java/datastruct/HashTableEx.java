package datastruct;

import java.util.HashMap;
import java.util.Map;

public class HashTableEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);
        System.out.println(map);
        System.out.println(map.get("key6"));
        map.put("key2", 88);
        System.out.println(map);
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println("Key " + entry.getKey() + " -- value: " + entry.getValue());
        }
    }
}
