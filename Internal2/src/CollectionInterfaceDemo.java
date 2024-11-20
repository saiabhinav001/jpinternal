import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;

public class CollectionInterfaceDemo {

    public static void main(String[] args) {
        // Using ArrayList
        System.out.println("Demonstrating ArrayList:");
        Collection<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Printing the collection
        System.out.println("ArrayList after adding elements: " + arrayList);

        // Checking if a specific element exists
        System.out.println("ArrayList contains 'Banana': " + arrayList.contains("Banana"));

        // Removing an element
        arrayList.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + arrayList);

        // Checking size
        System.out.println("ArrayList size: " + arrayList.size());

        // Iterating through elements
        System.out.println("Iterating over ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Clearing all elements
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
        System.out.println();

        // Using LinkedList
        System.out.println("Demonstrating LinkedList:");
        Collection<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Elephant");

        // Printing the collection
        System.out.println("LinkedList after adding elements: " + linkedList);

        // Checking if a specific element exists
        System.out.println("LinkedList contains 'Cat': " + linkedList.contains("Cat"));

        // Removing an element
        linkedList.remove("Cat");
        System.out.println("LinkedList after removing 'Cat': " + linkedList);

        // Checking size
        System.out.println("LinkedList size: " + linkedList.size());

        // Iterating through elements
        System.out.println("Iterating over LinkedList:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }

        // Converting LinkedList to ArrayList
        ArrayList<String> convertedList = new ArrayList<>(linkedList);
        System.out.println("Converted LinkedList to ArrayList: " + convertedList);
    }
}
