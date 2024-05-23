// HashMap
// Let's say you have a group of friends and you want to keep track of their phone numbers. Without a HashMap, you might create separate variables for each friend's name and phone number,


// But what if you have dozens or even hundreds of friends? That would be a lot of variables to keep track of!
// With a HashMap, you can store all the phone numbers in a single data structure and access them using each friend's name as the key. Here's what that looks like:

// In this example, we created a HashMap called phoneNumbers that maps each friend's name (a String) to their phone number (an Integer). The put() method adds a new key-value pair to the HashMap.
// To retrieve a phone number, we simply use the friend's name as the key:

import java.util.*;

class hasher
{
	public static void main (String[] args)
	{
        HashMap<String, Integer> phoneNumbers = new HashMap<>();
        
        phoneNumbers.put("Alice", 123456789);
        phoneNumbers.put("Bob", 987654321);
        
        int aliceNumber = phoneNumbers.get("Alice");
        System.out.println(aliceNumber);
	}
}