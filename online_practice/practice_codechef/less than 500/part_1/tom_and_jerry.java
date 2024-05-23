// In a classic chase, Tom is running after Jerry as Jerry has eaten Tom's favourite food.
// Jerry is running at a speed of X metres per second while Tom is chasing him at a speed of Y metres per second. 
// Determine whether Tom will be able to catch Jerry.
// Note that initially Jerry is not at the same position as Tom.

import java.util.*;
class chase{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int jerry = sc.nextInt();
		    int tom = sc.nextInt();
		    
		    System.out.println(tom > jerry ? "YES" : "NO");
		}
    }
}