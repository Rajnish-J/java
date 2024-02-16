// ArrayList

// ArrayList is like a bag that can hold an unlimited number of items. You can add or remove items from the bag as you please, and you can even sort them in any order you like.
// The best part is, you don't have to specify the size of the bag beforehand. You can just keep adding items until the bag is full.
// Here's how arraylists work:

import java.util.*;

class coder {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(12);
        numbers.add(25);
        numbers.add(34);
        numbers.add(46);

        // Remove element equal to 25
        for (int i = 0; i<numbers.size(); i++) {
            if (numbers.get(i) == 25) {
                numbers.remove(i);
                break;
            }
        }
        
        System.out.println(numbers);
    }
}
