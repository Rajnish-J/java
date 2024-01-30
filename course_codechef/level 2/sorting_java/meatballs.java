// Andrew and the Meatballs
// Andrew likes meatballs very much.

// He has N plates of meatballs, here the ith plate contains Pi meatballs. 
// You need to find the minimal number of plates Andrew needs to take to his trip to Las Vegas, if he wants to eat there at least M meatballs.
//  Note that each plate is already packed, i.e. he cannot change the amount of meatballs on any plate.

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            long meatballs = sc.nextLong();
            long[] list = new long[(int) size];
            long sum = 0;
            int count = 0;
            int flag = 0;
            
            for (int i = 0; i < size; i++) {
                list[i] = sc.nextLong();
            }
            
            Arrays.sort(list);

            for(int i = (int) size-1; i>=0; i--){
                    sum += list[i];
                    count++;
                    if(sum >= meatballs){
                        flag = 1;
                        break;
                    }
            }
            System.out.println(flag == 1 ? count : -1);
        }
    }
}

