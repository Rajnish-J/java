/*
ATM Machine

There is an ATM machine. Initially, it contains a total of K units of money. 
N people (numbered 1 through N) want to withdraw money; for each valid i, the i-th person wants to withdraw Ai units of money.

The people come in and try to withdraw money one by one, in the increasing order of their indices. 
Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it will give out the required amount. 
Otherwise, it will throw an error and not give out anything; in that case, this person will return home directly without trying to do anything else.

For each person, determine whether they will get the required amount of money or not.
 */
import java.util.*;

class ATM
{
    static Scanner sc=new Scanner(System.in);    
	public static void main (String[] args) throws java.lang.Exception
	{
		int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            StringBuilder ss=new StringBuilder();
            int[] a=new int[n];
            
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                a[i]=x;
            }
            
            for(int i=0;i<n;i++){
                if(a[i]<=k){
                    ss.append(1);
                    k=k-a[i];
                }
                else{
                    ss.append(0);
                }
            }
            System.out.println(ss);
        }
	}
}