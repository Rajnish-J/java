import java.util.*;
//Chef defines a pair of positive integers (a,b) to be oneful pair, a+b+(a⋅b)=111
public class exp_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a + b + a*b==111){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
    }
}
