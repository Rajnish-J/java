import java.util.*;

//Chef wants to appear in a competitive exam. To take the exam, there are following requirements:
//Minimum age limit is X (i.e. Age should be greater than or equal to X).
//Age should be strictly less than Y.
//Chef's current Age is A. Find whether he is currently eligible to take the exam or not.

class age_limit{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int i,T,x,y,a;
		T = sc.nextInt();
		for(i=0;i<T;i++){
		    x = sc.nextInt();
		    y = sc.nextInt();
		    a = sc.nextInt();
		    if(a>=x && a<y)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
    }
}