import java.util.*;
//According to a recent survey, Biryani is the most ordered food. Chef wants to learn how to make world-class Biryani from a MasterChef. 
//Chef will be required to attend the MasterChef's classes for X weeks, and the cost of classes per week is Y coins. 
//What is the total amount of money that Chef will have to pay?

public class biriyani {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i = 0; i<t ; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x*y;
            System.out.println(z);
        }
    }
    
}
