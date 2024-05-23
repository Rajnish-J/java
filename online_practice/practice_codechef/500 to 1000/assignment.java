// Janmansh has to submit 3 assignments for Chingari before 10 pm and he starts to do the assignments at X pm. 
// Each assignment takes him 1 hour to complete. Can you tell whether he'll be able to complete all assignments on time or not?

import java.util.*;

class assignments{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int time = sc.nextInt();

            int last_time = 10;
            System.out.println((last_time - time) >= 3 ? "YES" : "NO");
        }
    }
}