//Write a program to demonstrate linkedlist and its methods(add,set,size,isEmpty,get,remove) .
import java.util.LinkedList;

public class LinkedListTask {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Printing the LinkedList
        System.out.println("LinkedList after adding elements: " + linkedList);

        // Getting the size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Checking if the LinkedList is empty
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());

        // Getting an element from the LinkedList
        System.out.println("Element at index 1: " + linkedList.get(1));

        // Modifying an element in the LinkedList
        linkedList.set(1, "Grapes");
        System.out.println("LinkedList after modifying element at index 1: " + linkedList);

        // Removing an element from the LinkedList
        linkedList.remove("Cherry");
        System.out.println("LinkedList after removing 'Cherry': " + linkedList);
    }
}
