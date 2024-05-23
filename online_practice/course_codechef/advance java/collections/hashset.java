// HashSet

// A HashSet is like a super cool bag that can hold a bunch of unique items, but it's not just any bag, 
// it's a bag that uses a special algorithm to store the items in a way that makes it super easy to find them later.

//Let's say you have a bunch of different colored marbles, and you want to put them in your Hashset. 
// You can add each marble to the Hashset, and it will automatically use its algorithm and won't let you add the same color marble twice, because it only stores unique items!

import java.util.HashSet;

class hash {
   public static void main(String[] args) {
      HashSet<String> marbles = new HashSet<String>();
      marbles.add("Red");
      marbles.add("Green");
      marbles.add("Blue"); 
      marbles.add("Red");
      System.out.println(marbles);
   }
}