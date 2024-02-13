// Chef and easy problem
// Read problems statements in Mandarin Chinese and Russian.
// Chef and Roma are playing a game. Rules of the game are quite simple. Initially there are N piles of stones on the table. 
// In each turn, a player can choose one pile and remove it from the table. 
// Each player want to maximize the total number of stones removed by him. Chef takes the first turn.

// Please tell Chef the maximum number of stones he can remove assuming that both players play optimally.

import java.util.*;

class stone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            long sum = 0;

            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            for(int i = size - 1 ; i >= 0 ; i-=2){
                    sum += arr[i];
                }
            System.out.println(sum);
        }
    }
}