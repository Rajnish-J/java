import java.util.*;

class Polynomial
{
	public static void main (String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		 int size=sc.nextInt();
		 int a[]= new int[size];
		 int max=0;
		 for (int i=0;i<size ;i++ ){
		     a[i]=sc.nextInt();
		     if(a[i]!=0){
		         
		         max=i;
		     }
		 } 
		 System.out.println(max);
		}
	}
}