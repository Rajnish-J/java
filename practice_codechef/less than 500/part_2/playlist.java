// Chef's playlist contains 3 songs named A,B, and C, each of duration exactly X minutes. 
// Chef generally plays these 3 songs in loop, i.e, A→B→C→A→B→C→A→…

// Chef went on a train journey of N minutes and played his playlist on loop for the whole journey. 
// How many times did he listen to the song C completely?

import java.util.*;

class playlist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int time_have = sc.nextInt();
		    int song_time = sc.nextInt();
		    
		    if(time_have < song_time){
		        System.out.println(0);
		    }
		    else{
		        int played_time = 3*song_time;
		        System.out.println(time_have / played_time);
		    }
		}

	}
}
