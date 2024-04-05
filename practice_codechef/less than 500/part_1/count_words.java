// Harsh was recently gifted a book consisting of N pages. Each page contains exactly M words printed on it. 
// As he was bored, he decided to count the number of words in the book.
// Help Harsh find the total number of words in the book.

import java.util.*;
class count_words
{   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int pages = sc.nextInt();
		    int words = sc.nextInt();
		    
		    System.out.println(pages * words);
		}
    }
}