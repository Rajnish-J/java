// In a test, there are N problems, each carrying X marks.
// In each problem, Chef either received X marks or 0 marks.

// Determine whether is it possible for Chef to achieve exactly Y marks.

import java.util.*;

class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int number = sc.nextInt();
            int max_mark = sc.nextInt();
            int target = sc.nextInt();

            System.out.println((target == 0) ? "YES" : (max_mark > target) ? "NO" : (target % max_mark == 0) ? "YES" : "NO");
        }
    }
}