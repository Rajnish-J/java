// LinkedHashMap

// Let's talk about what a LinkedHashMap actually is. Simply put, it's a combination of two other data structures: a HashMap and a LinkedList.

// A HashMap is a collection of key-value pairs that allows for fast lookup and insertion. A LinkedList is a collection of elements that maintains a specific order. 
// So, a LinkedHashMap is a Map that maintains the order of its elements, just like a LinkedList.

// So, why would we use a LinkedHashMap instead of just a regular HashMap?

// Well, let's say we have a HashMap with some key-value pairs in it. If we iterate over the HashMap, the order of the elements is not guaranteed. 
// However, with a LinkedHashMap, the order of the elements is guaranteed to be the order in which they were inserted. 
// This can be very useful in certain situations, such as when we need to maintain the order of items in a shopping cart.

import java.util.*;

class maper
{
	public static void main (String[] args)
	{
        Map<String, Integer> cart = new LinkedHashMap<>();
        
        cart.put("apple", 1);
        cart.put("orange", 2);
        cart.put("banana", 3);
        
        int orangeCount = cart.get("orange");
        
        System.out.println(orangeCount);
        System.out.println(cart);
	}
}