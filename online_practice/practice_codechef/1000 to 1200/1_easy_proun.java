/*
Easy Pronunciation

Words that contain many consecutive consonants, like "schtschurowskia", are generally considered somewhat hard to pronounce.

We say that a word is hard to pronounce if it contains 4 or more consonants in a row; otherwise it is easy to pronounce. 
For example, "apple" and "polish" are easy to pronounce, but "schtschurowskia" is hard to pronounce.

You are given a string S consisting of N lowercase Latin characters. 
Determine whether it is easy to pronounce or not based on the rule above — print YES if it is easy to pronounce and NO otherwise.

For the purposes of this problem, the vowels are the characters {a,e,i,o,u} and the consonants are the other 21 characters.
 */

import java.util.*;

class easy_proun{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.next();
            str.toLowerCase();
            if(n<4){
                System.out.println("YES");
            }
            else{ 
                int count=0;
                for(int i=0; i<str.length(); i++){
                    char check = str.charAt(i);
                    if(count==4){
                        break;
                    }
                    if(check =='a' || check =='e' || check =='i' || check =='o' || check =='u' ){
                        count=0;
                    }
                    else{
                        count++;
                    }
                }
                if(count==4){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}