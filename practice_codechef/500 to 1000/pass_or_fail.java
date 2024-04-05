/*
Pass or Fail

Chef is struggling to pass a certain college course.
The test has a total of N questions, each question carries 3 marks for a correct answer and −1 for an incorrect answer. 
Chef is a risk-averse person so he decided to attempt all the questions. It is known that Chef got X questions correct and the rest of them incorrect. 
For Chef to pass the course he must score at least P marks.

Will Chef be able to pass the exam or not?
 */

 import java.util.*;
 
 /* Name of the class has to be "Main" only if the class is public. */
 class pass_or_fail
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         for(int i=0;i<t;i++)
         {
             int n=sc.nextInt();
             int x=sc.nextInt();
             int p=sc.nextInt();
             int c=x*3;
             int y=n-x;
             if((c-y) >=p)
             {
                 System.out.println("PASS");
             }
             else{
                 System.out.println("FAIL");
             }
             
         }
     }
 }