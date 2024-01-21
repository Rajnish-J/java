// There is a group of N friends who wish to enroll in a course together. 
// The course has a maximum capacity of M students that can register for it. 
// If there are K other students who have already enrolled in the course, 
// determine if it will still be possible for all the N friends to do so or not.

import java.util.*;

class course
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int friends = sc.nextInt();
		    int capacity = sc.nextInt();
		    int registered = sc.nextInt();
		    
		    System.out.println(((capacity - registered) >= friends) ? "YES" : "NO");
		}
 
	}
}
