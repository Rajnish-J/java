/*
Candies
Abhi is a salesman. He was given two types of candies, which he is selling in N different cities.
For the prices of the candies to be valid, Abhi's boss laid down the following condition:

* A given type of candy must have distinct prices in all N cities.

In his excitement, Abhi wrote down the prices of both the candies on the same page and in random order instead of writing them on different pages. 
Now he is asking for your help to find out if the prices he wrote are valid or not.

You are given an array A of size 2N. Find out whether it is possible to split A into two arrays, each of length N, such that both arrays consist of distinct elements.

Both arrays can have distinct elements only if no element in the original array is repeated more than twice.
 */

import java.util.*;

class Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int [] a = new int [n*2];
        
            for(int j=0;j<a.length;j++){
                a[j]= sc.nextInt();
            }
        
            int count=0;
            int count2= 0;
        
            for(int j=0;j<a.length;j++){
                count=0;
                for(int k =0;k<a.length;k++){
                    if (a[j]==a[k]){
                        count++;
                    }
                }
                if(count>2){
                    System.out.println("No");
                    break;
                }
                else{
                    count2++;
                }
            }
            if(count2 ==a.length){
                System.out.println("Yes");
            }
        }
    }
} 