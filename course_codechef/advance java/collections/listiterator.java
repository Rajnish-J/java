// ListIterator

// ListIterator is an interface in Java that provides a way to traverse a list in both forward and backward directions, and also allows us to modify the list while iterating over it. 
// In addition to the basic methods of Iterator, such as hasNext() and next(), ListIterator provides several additional methods that make it a powerful tool for manipulating lists.

// Let's take a look at some of the methods of ListIterator and how they can be used:
// * hasNext() and next(): These methods are used to traverse the list in the forward direction. hasNext() returns true if there are more elements in the list and next() returns the next element.
// * hasPrevious() and previous(): These methods are used to traverse the list in the backward direction. 
    // hasPrevious() returns true if there are more elements in the list in the backward direction and previous() returns the previous element.
// * add(Object o): This method adds an element to the list at the current position of the iterator.
// * remove(): This method removes the last element returned by next() or previous() from the list.
// * set(Object o): This method replaces the last element returned by next() or previous() with the specified element.

// Now, let's see how we can use these methods in code to iterate over a list and modify it, Check the code in the IDE
// In this code, we first create a list of fruits and then use ListIterator to traverse the list and modify it. 
    // We remove "Banana" using remove(), add "Grapefruit" using add(), and replace "Apple" with "Pear" using set().
// After that, we use hasPrevious() and previous() to traverse the list in the backward direction and print the fruits in reverse order.
// Finally, we use add() to add "Mango" to the list and print the modified list.


import java.util.*;

class length
{
	public static void main (String[] args)
	{
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        
        ListIterator<String> iterator = myList.listIterator();
        
        while(iterator.hasNext()) {
            String fruit = iterator.next();
            if(fruit.equals("Banana")) {
                iterator.remove();
            }
            if(fruit.equals("Orange")) {
                iterator.add("Grapefruit");
            }
            if(fruit.equals("Apple")) {
                iterator.set("Pear");
            }
        }
        
        while(iterator.hasPrevious()) {
            String fruit = iterator.previous();
            System.out.println(fruit);
        }
        
        iterator.add("Mango");
        
        System.out.println(myList);
	}
}