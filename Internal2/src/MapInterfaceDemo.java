import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceDemo {
    public static void main(String[] args) {

        // Using HashMap
        System.out.println("Demonstrating HashMap:");
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding elements (key-value pairs)
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 2);
        hashMap.put("Mango", 5);
        hashMap.put("Orange", 4);
        hashMap.put("Apple", 6); // Overwriting existing value of "Apple"

        // Printing HashMap
        System.out.println("HashMap after adding elements: " + hashMap);

        // Checking if a key exists
        System.out.println("HashMap contains key 'Banana': " + hashMap.containsKey("Banana"));
        System.out.println("HashMap contains key 'Grapes': " + hashMap.containsKey("Grapes"));

        // Checking if a value exists
        System.out.println("HashMap contains value 5: " + hashMap.containsValue(5));

        // Retrieving a value by key
        System.out.println("Value for key 'Mango': " + hashMap.get("Mango"));

        // Removing an element by key
        hashMap.remove("Orange");
        System.out.println("HashMap after removing 'Orange': " + hashMap);

        // Iterating over HashMap
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Clearing all elements
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
        System.out.println();

        // Using TreeMap
        System.out.println("Demonstrating TreeMap:");
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements (key-value pairs)
        treeMap.put("Apple", 3);
        treeMap.put("Banana", 2);
        treeMap.put("Mango", 5);
        treeMap.put("Orange", 4);
        treeMap.put("Apple", 6); // Overwriting existing value of "Apple"

        // Printing TreeMap (sorted by keys)
        System.out.println("TreeMap after adding elements: " + treeMap);

        // Checking if a key exists
        System.out.println("TreeMap contains key 'Banana': " + treeMap.containsKey("Banana"));
        System.out.println("TreeMap contains key 'Grapes': " + treeMap.containsKey("Grapes"));

        // Checking if a value exists
        System.out.println("TreeMap contains value 5: " + treeMap.containsValue(5));

        // Retrieving a value by key
        System.out.println("Value for key 'Mango': " + treeMap.get("Mango"));

        // Removing an element by key
        treeMap.remove("Orange");
        System.out.println("TreeMap after removing 'Orange': " + treeMap);

        // Iterating over TreeMap
        System.out.println("Iterating over TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Clearing all elements
        treeMap.clear();
        System.out.println("TreeMap after clearing: " + treeMap);
    }
}
