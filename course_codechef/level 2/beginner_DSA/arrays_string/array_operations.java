// In this module on Array Operations, 
// we will learn the concepts required to successfully perform beginner level array construction and manipulation required in programming problems.

// Let's talk a little about ArrayList, a class which can be found in the java.util package. How is it different from Array?.

// In a built-in array, it's size cannot be modified i.e., you can't add or remove elements to and from the array. 
// That's where ArrayList comes handy. You can add or remove elements from an ArrayList whenever you want. The syntax goes like this:

// Creating an ArrayList:

// import java.util.ArrayList; // import the ArrayList class
// ArrayList codechef = new ArrayList< >(); // Create an ArrayList object `Chef` of type `String`

// Adding elements:
// codechef.add("chef");
// codechef.add("chefina"); // the first element will be "chef" and second will be "chefina"

//Accessing elements:
//codechef.get(0) // Refer to the index number of the element you need to access

//Removing elements:
//codechef.remove(0); // Refer to the index number of the element you need to remove

//Changing elements:
//codechef.set(0, "code"); // Changes the element in 0th index to "code"

//Find size of an ArrayList:
//codechef.size();

//To create an ArrayList of integer type we use Integer instead of String, like this:
//ArrayList codechef = new ArrayList< >();

//Note: You may or may not Add Type of ArrayList inside <> on the right side, as codechef variable type is already declared on the left hand side.

import java.util.ArrayList;

class Codechef
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