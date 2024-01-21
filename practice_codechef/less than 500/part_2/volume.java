// Chef is watching TV. The current volume of the TV is X. 
// Pressing the volume up button of the TV remote increases the volume by 1 while pressing the volume down button decreases the volume by 1. 
// Chef wants to change the volume from X to Y. Find the minimum number of button presses required to do so.

import java.util.*;

class volume
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int initial = sc.nextInt();
		    int finnal = sc.nextInt();
		    
		    System.out.println((initial < finnal) ? finnal - initial : initial - finnal);
		}

	}
}
