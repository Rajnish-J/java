// LinkedHashSet

// You already know about HashSet, Let's see what a LinkedHashSet does in Java. This concept is actually pretty exciting because it combines the best of both worlds: HashSet and LinkedList.

// LinkedHashSet is similar to HashSet, but with one key difference: it maintains the insertion order of elements.

// Imagine a user creates a playlist of their favorite songs, they want the songs to play in the order they added them to the playlist. 
// If a HashSet was used to store the songs, the order would not be maintained and the songs would play in a random order.

// However, if a LinkedHashSet was used instead, the order of the songs would be maintained and they would play in the exact order the user added them to the playlist. 
// Plus you can't add a song that already exists in the playlist

import java.util.LinkedHashSet;

class linkeed {
  public static void main(String[] args) {
    LinkedHashSet<String> playlist = new LinkedHashSet<String>();
    playlist.add("Moonlight Sonata");
    playlist.add("The Godfather");
    playlist.add("Whiplash");
    playlist.add("Whiplash");

    System.out.println(playlist);
  }
}