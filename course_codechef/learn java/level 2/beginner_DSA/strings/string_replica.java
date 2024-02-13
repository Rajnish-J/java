//Let's begin with a problem which covers our knowledge of 'String' syntax.
//You are given a string S consisting of only lowercase english characters.
//You need to generate 2 separate strings A and B

// * String A needs to be an exact replica of string S - it has to be created by starting with an empty string
// * String B is reverse of string S.

import java.util.*;
class replica{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String s = read.next();
    		String a = "";
    		
    		// Use for loop to loop through every character of S
    		for(int j=0; j<s.length(); j++){
    		    // Adds the character to the end of A
    		    a = a + s.charAt(j);
    		}
    		
    		String b = "";
    		// Use for loop to loop through every character of S
    		for(int k=0; k<s.length(); k++){
    		    // Adds the character to the start of B
    		    b = a.charAt(k) + b;
    		}
    		System.out.println(a);
    		System.out.println(b);
		}
    }
}