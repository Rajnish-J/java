//Chef and some of his friends are planning to participate in a puzzle hunt event.
//The rules of the puzzle hunt state:"This hunt is intended for teams of 6 to 8 people."
// Chef's team has N people in total. Are they eligible to participate?

import java.util.*;
class puzzle_hunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		    int count = sc.nextInt();
		    if((count>=6) && (count<=8)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
    }
}
