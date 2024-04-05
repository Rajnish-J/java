// TreeSet

// A TreeSet is a collection that stores elements in sorted order. It is implemented using a tree structure, and it ensures that all elements are unique. 
// This means that no duplicates are allowed in a TreeSet.

// Imagine you have a bunch of names, and you want them sorted in alphabetic order. 
// You can use a TreeSet to do that for you! Just add all your names to the TreeSet, and voila, they're sorted! And if you accidentally add a duplicate name, 
// the TreeSet will automatically remove it, so you don't have to worry about it.

import java.util.*;

class tree {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Charlie");
        names.add("Bob");
        names.add("Alice");
        names.add("Bob");
        System.out.println(names);
  }
}