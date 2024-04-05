// For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:

// 00 is replaced with A
// 01 is replaced with T
// 10 is replaced with C
// 11 is replaced with G
// Given a binary string S of length N (N is even), find the encoded sequence.

import java.util.*;
class alpha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0){
    	    int n=sc.nextInt();
    	    String s=sc.next();
    	    String result="";
            for (int i=0;i<n ;i+=2 ){
                 if(s.charAt(i)=='0' && s.charAt(i+1)=='0'){
                     result+="A";
                 }else if (s.charAt(i)=='0' && s.charAt(i+1)=='1') {
                     result+="T";
                 }else if (s.charAt(i)=='1' && s.charAt(i+1)=='0'){
                     result+="C";
                 }else {
                     result+="G";
                     
                 }    
            } 
             System.out.println(result);
    	}
    }
}