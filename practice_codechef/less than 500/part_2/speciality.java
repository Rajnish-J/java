// On every CodeChef user's profile page, the list of problems that they have set, tested, and written editorials for, is listed at the bottom.

// Given the number of problems in each of these 3 categories as X,Y, and Z respectively (where all three integers are distinct), 
// find if the user has been most active as a Setter, Tester, or Editorialist.

import java.util.*;

class special
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int setter = sc.nextInt();
		    int tester = sc.nextInt();
		    int editoralist = sc.nextInt();
		    
		    System.out.println((setter > tester) ? "Setter" : (tester > editoralist) ? "Tester" : "Editorialist");
		    
		}

	}
}
