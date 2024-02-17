// Practice - Map Interface

// Write a program to do the following using the appropriate Map Interface

// Create a Map to store the name and height of a person
// The Keys and their Values being: ("Bob"=6.0, "Alice"=5.6, "Charlie"=5.9)
// Remove a person from the map whose name goes by "Charlie"
// Print the updated Map in alphabetical order.

import java.util.*;

class practice1
{
	public static void main (String[] args)
	{
        Map<String, Double> map = new TreeMap<String, Double>();
        
        map.put("Bob", 6.0);
        map.put("Charlie", 5.9);
        map.put("Alice", 5.6);

        map.remove("Charlie");
        
        System.out.println(map);
	}
}