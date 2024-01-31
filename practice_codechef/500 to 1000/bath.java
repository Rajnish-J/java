// Bath in Winters

//A geyser has a capacity of X litres of water and a bucket has a capacity of Y litres of water.
// One person requires exactly 2 buckets of water to take a bath. 
// Find the maximum number of people that can take bath using water from one completely filled geyser..

import java.util.*;

class bath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int geyser_heater = sc.nextInt();
            int bucket = sc.nextInt();
    
            int one_person = 2 * bucket;
            System.out.println(geyser_heater / one_person);
        }
    }
}