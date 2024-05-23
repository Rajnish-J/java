// chef has decided to join a Gym in ChefLand and if possible, also hire a personal trainer at the gym. 
// The monthly cost of the gym is X and personal training will cost him an additional Y per month. Chef's total budget per month is only Z. 
// Print 1 if Chef can only join the gym, 2 if he can also have a personal trainer, and 0 if he can't even join the gym.

// Note that if Chef wants to hire a personal trainer, he must join the gym — he cannot hire the trainer without joining the gym.

import java.util.*;

class gym
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int gym_fee = sc.nextInt();
		    int trainee_fee = sc.nextInt();
		    int budget = sc.nextInt();
		    
		    System.out.println((gym_fee + trainee_fee) <= budget ? 2 : (gym_fee <= budget) ? 1 : 0);
		}

	}
}
