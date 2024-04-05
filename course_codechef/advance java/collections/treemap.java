// TreeMap

// Think of a TreeMap as a magical tool that helps you organize data in a tree-like structure. It allows you to store key-value pairs, just like a regular Map, but with a twist - the keys are sorted in a specific order. 
// This means you can easily access, search, and manipulate the data based on the keys.

// Let me give you an example. Say you have a list of students and their corresponding grades. You can create a TreeMap with the student names as keys and their grades as values. 
// Now, you can easily find the grade of any student by searching for their name in the TreeMap.

import java.util.*;

class treemap
{
	public static void main (String[] args)
	{
        Map<String, Integer> grades = new TreeMap<>();
        
        grades.put("Alice", 90);
        grades.put("Charlie", 80);
        grades.put("Bob", 70);
        
        int aliceGrade = grades.get("Alice");
        System.out.println(aliceGrade);
        // Notice how the map is sorted
        System.out.println(grades);
	}
}