// Six friends go on a trip and are looking for accommodation. 
// After looking for hours, they find a hotel which offers two types of rooms — double rooms and triple rooms. 
// A double room costs Rs. X, while a triple room costs Rs. Y.
// The friends can either get three double rooms or get two triple rooms. 
// Find the minimum amount they will have to pay to accommodate all six of them.

import java.util.*;

class six
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int dble = sc.nextInt();
		    int triple = sc.nextInt();
		    
		    System.out.println(3 * dble > 2 * triple ? 2*triple : 3 * dble);
		}

	}
}
