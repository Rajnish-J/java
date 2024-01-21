// Our Chef is currently practicing on CodeChef and is a beginner. The count of ‘All Problems’ in the Beginner section is X. 
//Our Chef has already ‘Attempted’ Y problems among them. How many problems are yet ‘Un-attempted’?

import java.util.*;

class attempted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int total_questions = sc.nextInt();
		    int attempted = sc.nextInt();
		    int unattempted;
		    
		    unattempted = total_questions - attempted;
		    System.out.println(unattempted);
		}
    }
}