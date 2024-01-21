//Let us solve a problem on binary strings
//You are given 2 separate binary strings - A and B - both of equal length.
//You need to output the following

// * Count of '1's in each string
// * Count of indices (l) where a.charAt(l)=b.charAt(l)

import java.util.*;
class binary_string {
    public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String a = read.next();
    		String b = read.next();
    		
            int a_count = 0;        
            int b_count = 0;        
            int common = 0;
            
            for(int j=0; j<a.length(); j++){
    		    if(a.charAt(j) == '1'){
    		        a_count = a_count + 1;
    		    }
    		}
    		for(int k=0; k<b.length(); k++){
    		    if(b.charAt(k) == '1'){
    		        b_count = b_count + 1;
    		    }
    		}
    		
    		
    		int l=0;
    		int n = a.length();
    		while(l<n){
    		    if(a.charAt(l) == b.charAt(l)){
    		        common = common + 1;
    		    }
    		    l++;
    		}
    		System.out.println(a_count + " " + b_count + " " + common);
		}
	}
    
}
