//constructing an array and printing the reverse order...

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class array_construction {
    public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
		    ArrayList<Integer> a = new ArrayList<Integer>();
		    int n = read.nextInt();
		    for(int j=1; j<=n; j++){
    		    a.add(j);
		    }
		    System.out.println(a);
		    Collections.sort(a, Collections.reverseOrder());
		    System.out.println(a);
		}
	}
}

