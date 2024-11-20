import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Get an Iterator for the ArrayList
        Iterator<String> iterator = fruits.iterator();

        // Use the Iterator to traverse the list
        System.out.println("Iterating over the ArrayList using Iterator:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Removing an element during iteration
        System.out.println("\nRemoving an element during iteration:");
        iterator = fruits.iterator(); // Resetting the iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                System.out.println("Removing: " + fruit);
                iterator.remove();
            }
        }

        // Display the list after removal
        System.out.println("\nArrayList after removal:");
        System.out.println(fruits);
    }
}
