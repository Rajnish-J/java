// ArrayList
// ArrayList is like a bag that can hold an unlimited number of items. You can add or remove items from the bag as you please, and you can even sort them in any order you like.

// The best part is, you don't have to specify the size of the bag beforehand. You can just keep adding items until the bag is full.

// Here's how arraylists work:

import java.util.*;

class arraylists
{
	public static void main (String[] args)
	{
	    // Create an ArrayList
		ArrayList<String> codechef = new ArrayList<>();
		
		// Add elements
		codechef.add("chef");
        codechef.add("chefina");
        System.out.println("ArrayList with 2 Strings: " + codechef);
        
        // Access element
        System.out.println("First element of the ArrayList: " + codechef.get(0));
        
        // Remove element
        codechef.remove(0);
        System.out.println("First element removed: " + codechef);
        
        // Change element
        codechef.set(0, "code");
        System.out.println("First element changed to: " + codechef.get(0));
        
        // size of the ArrayList
        System.out.print("Size of/number of elements in the ArrayList: " + codechef.size());
	}
}