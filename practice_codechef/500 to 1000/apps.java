// Chef and his Apps

// Chef's phone has a total storage of S MB. Also, Chef has 2 apps already installed on his phone which occupy X MB and Y MB respectively.
// He wants to install another app on his phone whose memory requirement is Z MB. 
// For this, he might have to delete the apps already installed on his phone. 
// Determine the minimum number of apps he has to delete from his phone so that he has enough memory to install the third app.


import java.util.*;

class app
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--<0){
		    int s = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    if(x+y+z<=s){
                System.out.println("0");
            } 
		    else if(x+z<=s || y+z<=s) {
                System.out.println("1");
            }
		    else{
                System.out.println("2");
            }
		}
	}
}