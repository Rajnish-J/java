import java.util.*;
public class right_there {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int people = sc.nextInt();
		    int need = sc.nextInt();
		    
		    System.out.println((people<=need)? "YES" : "NO");
		}
    }
}
