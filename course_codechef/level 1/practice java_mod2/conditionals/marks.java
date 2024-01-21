import java.util.*;
// Alice has scored X marks in her test and Bob has scored 
// Y marks in the same test. Alice is happy if she scored at least twice the marks of Bob’s score. Determine whether she is happy or not.

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int alice = sc.nextInt();
		int bob = sc.nextInt();
		if(alice >= bob*2){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
    }
}
