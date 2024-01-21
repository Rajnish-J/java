import java.util.*;
//Alice and Bob were having an argument about which of them is taller than the other. Charlie got irritated by the argument, 
//and decided to settle the matter once and for all.
//Charlie measured the heights of Alice and Bob, and got to know that Alice's height is X centimeters and Bob's height is Y centimeters. 
//Help Charlie decide who is taller.

class taller {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-- > 0){
		    int alice = sc.nextInt();
		    int bob = sc.nextInt();
		    if(alice>bob){
		        System.out.println("Alice");
		    }else{
		        System.out.println("Bob");
		    }
		}
        
    }
}
