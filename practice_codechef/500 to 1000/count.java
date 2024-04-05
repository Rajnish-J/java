// You know that 1 kg of pulp can be used to make 1000 pages and 1 notebook consists of 100 pages.
// Suppose a notebook factory receives N kg of pulp, how many notebooks can be made from that?

import java.util.*;

class count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int kgs = sc.nextInt();
            System.out.println(kgs * 10);
        }        
    }
}