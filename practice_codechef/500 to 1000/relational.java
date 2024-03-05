/*
Chef And Operators
Chef has just started Programming, he is in first year of Engineering. Chef is reading about Relational Operators.
Relational Operators are operators which check relationship between two values. 
Given two numerical values A and B you need to help chef in finding the relationship between them that is,

First one is greater than second or, First one is less than second or, First and second one are equal.
 */

import java.util.*;
class Relational{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                System.out.println(">");
            }
            if(a<b){
                System.out.println("<");
            }
            if(a==b){
                System.out.println("=");
            }
        }
    }
}