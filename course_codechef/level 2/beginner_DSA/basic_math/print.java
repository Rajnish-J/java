//You are given an integer N.
//You need to create and output to the console all the digits of this integer, each separated by a space.

import java.util.*;
class print {
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int n = read.nextInt();
            
            ArrayList<Integer> final_ans = new ArrayList<>();
            while (n>0) {
                // insert the last digit of n to the start of the list
                final_ans.add(0, n % 10);
                // update n as n/10 - removes the last digit of n
                n = n / 10;
            }
            for (int j=0; j<final_ans.size(); j++) {
                System.out.print(final_ans.get(j) + " ");
            }
            System.out.println();
        }
    }
}
