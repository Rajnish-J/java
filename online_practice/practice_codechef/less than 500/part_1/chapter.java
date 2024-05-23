// This semester, Chef took X courses. Each course has Y units and each unit has Z chapters in it.
// Find the total number of chapters Chef has to study this semester.

import java.util.*;

class chapter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int sem = sc.nextInt();
		    int unit = sc.nextInt();
		    int chapters = sc.nextInt();
		    
		    System.out.println(sem * unit * chapters);
		}

	}
}
