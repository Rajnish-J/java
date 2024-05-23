//Chef has N friends.
//Chef promised that he would gift a pair of shoes (consisting of one left shoe and one right shoe) to each of his N friends.
//Chef already has M left shoes.
//What is the minimum number of extra shoes that Chef will have to buy to ensure that he is able to gift a pair of shoes to each of his N friends? 
//Check sample test cases below for further clarity

// Once the observations / logic is clear, click on 'Next' to continue
// Once the observations / logic is clear, click on 'Next' to continue
import java.util.*;

class shoes{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            
            int friends = sc.nextInt();
            int left_shoes = sc.nextInt();
            int req = 0;
            
            if(friends<=left_shoes){
                System.out.println(friends);
            }
            else{
                req = (2*friends) - left_shoes;
                System.out.println(req);
            }
        }
    }
}
