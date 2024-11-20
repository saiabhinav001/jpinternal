import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterationDemo {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Iterating using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        // Iterating using traditional for loop with ListIterator
        System.out.println("Iterating using ListIterator:");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();

        // Iterating in reverse order using ListIterator
        System.out.println("Iterating in reverse order:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}

