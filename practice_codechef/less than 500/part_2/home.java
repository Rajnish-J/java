// Chef is hungry and wants to reach home.
// Chef can travel up to 5 kilometres on 1 litre of fuel on his motorcycle.
// Currently, his motorcycle is filled with X litres of fuel and his home is Y kilometres away.
// Determine whether Chef can reach his home on his motorcycle or not.

import java.util.*;

class sweethome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int litres = sc.nextInt();
		    int distance = sc.nextInt();
		    
		    System.out.println(((litres * 5) >= distance) ? "YES" : "NO");
		}

	}
}
