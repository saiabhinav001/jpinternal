import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetInterfaceDemo {
    public static void main(String[] args) {

        // Using HashSet
        System.out.println("Demonstrating HashSet:");
        Set<String> hashSet = new HashSet<>();

        // Adding elements to HashSet
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add("Apple"); // Duplicate element (will not be added)

        // Printing HashSet
        System.out.println("HashSet after adding elements: " + hashSet);

        // Checking if an element exists
        System.out.println("HashSet contains 'Mango': " + hashSet.contains("Mango"));
        System.out.println("HashSet contains 'Grapes': " + hashSet.contains("Grapes"));

        // Removing an element
        hashSet.remove("Orange");
        System.out.println("HashSet after removing 'Orange': " + hashSet);

        // Checking size
        System.out.println("HashSet size: " + hashSet.size());

        // Iterating over HashSet
        System.out.println("Iterating over HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Clearing all elements
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
        System.out.println();

        // Using TreeSet
        System.out.println("Demonstrating TreeSet:");
        Set<String> treeSet = new TreeSet<>();

        // Adding elements to TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Mango");
        treeSet.add("Apple"); // Duplicate element (will not be added)

        // Printing TreeSet (sorted order)
        System.out.println("TreeSet after adding elements: " + treeSet);

        // Checking if an element exists
        System.out.println("TreeSet contains 'Mango': " + treeSet.contains("Mango"));
        System.out.println("TreeSet contains 'Grapes': " + treeSet.contains("Grapes"));

        // Removing an element
        treeSet.remove("Orange");
        System.out.println("TreeSet after removing 'Orange': " + treeSet);

        // Checking size
        System.out.println("TreeSet size: " + treeSet.size());

        // Iterating over TreeSet
        System.out.println("Iterating over TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Clearing all elements
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}

