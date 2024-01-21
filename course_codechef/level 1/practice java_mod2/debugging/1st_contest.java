import java.util.*;
import java.lang.*;
import java.io.*;

//Each contest - there are approximately 1500 - 2000 users who participate for the 1st time and get rated.
//The Chef wanted to tell new users some tricks for their 1st contest:
// * Before the contest - you don’t have any rating. So even if you make a single submission, 
//you will become part of the contest rank list and you will get a rating.
// * If you want your rating to increase - give the entire 2 hours to the contest & don’t quit! If you keep trying till the end, 
//and the more time you get, the more problems you can solve. That means larger rating increases!
// * Do not ask your friends for their code. If you copy paste their code, you will get caught during plagiarism checks 
//and your rating will be reduced by 275 points, along with a permanent black mark on your profile.

class first_contest {
    public static void main(String[] args) throws java.lang.Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String arr[]= new String[3];
		arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int A = Integer.parseInt(arr[1]);
		int B = Integer.parseInt(arr[2]);
		int C = N-A;
		
		System.out.println((C)+" "+(C-B));
    }
    
}
