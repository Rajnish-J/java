// Ashu and Arvind participated in a coding contest, as a result of which they received N chocolates. 
// Now they want to divide the chocolates between them equally. 
// Can you help them by deciding, 
// if it is possible for them to divide all the N chocolates in such a way that they each get an equal number of chocolates?
// You cannot break a chocolate in two or more pieces.

import java.util.*;
class parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int num = sc.nextInt(); 
		    
		    System.out.println((num%2 == 0) ? "YES" : "NO");
		}
    }
}
