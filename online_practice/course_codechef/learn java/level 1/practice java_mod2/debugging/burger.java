import java.util.*;
//Chef is fond of burgers and decided to make as many burgers as possible.
//Chef has A patties and B buns. To make 1 burger, Chef needs 1 patty and 1 bun.
//Find the maximum number of burgers that Chef can make.

public class burger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) 
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x>y){
			    System.out.println(y);
			}
		    else if (x<y) {
		        System.out.println(x);
		    }
		    else{
		        System.out.println(x);
		    }
    }
    
}
}