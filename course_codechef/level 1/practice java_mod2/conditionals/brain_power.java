import java.util.*;
//In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of 
//X bits per second above which his calculations are prone to errors. If Chef is currently working at 
//Y bits per second, is he prone to errors?
class brain_power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b>a){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
    }
}