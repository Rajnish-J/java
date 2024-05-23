import java.util.*;
//Recently, Chef visited his doctor. The doctor advised Chef to drink at least 2000 ml of water each day.
//Chef drank X ml of water today. Determine if Chef followed the doctor's advice or not.
public class drinking {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		for(int i = 0; i<t ; i++){
		    
		    int chef = sc.nextInt();
		    if(chef >= 2000){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
    }
    
}
