// Chef decided to redecorate his house, and now needs to decide between two different styles of interior design.
// For the first style, tiling the floor will cost X1 rupees and painting the walls will cost Y1 rupees.
// For the second style, tiling the floor will cost X2 rupees and painting the walls will cost Y2 rupees.
// Chef will choose whichever style has the lower total cost. How much will Chef pay for his interior design?

import java.util.*;

class design
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int style_1 = sc.nextInt();
		    int design_cost_1 = sc.nextInt();
		    int style_2 = sc.nextInt();
		    int design_cost_2 = sc.nextInt();
		    
		    int cost_1 = style_1 + design_cost_1;
		    int cost_2 = style_2 + design_cost_2;
		    
		    if(cost_1 <= cost_2){
		        System.out.println(cost_1);
		    }
		    else{
		        System.out.println(cost_2);
		    }
		}

	}
}
