// Chef had collected N notes of Rs. 2000 to pay his total college fees. 
// However, the government banned Rs. 2000 notes.

// Chef wants to pay the same amount using Rs. 500 notes only. Find the number of notes Chef needs.

import java.util.*;
class need {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int res = (N * 2000) / 500;
		
		System.out.println(res);
    }
}
