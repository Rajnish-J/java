// for-each loop
// A for-each loop is a shorthand way of iterating through a collection of data. It's a more concise and readable way of writing a loop that iterates through all the elements of a collection.

// To give you an idea of how this works, let's take a look at some code.

import java.util.*;

class forr
{
	public static void main (String[] args)
	{
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Dave");
        
        for(String name : names) {
            System.out.println(name);
        }
	}
}