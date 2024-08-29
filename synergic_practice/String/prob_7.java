// ! Java Program to find all subsets of a string
// ! total possible subsets are (n*(n+1))/2

import java.util.*;

public class prob_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        int len = str.length();
        int temp = 0;

        // * for possible subset length
        String[] arr = new String[(len*(len+1))/2];

        // * for the full string traverse
        for(int i= 0; i<len; i++){
            // * to add the next character
            for(int j = i;j<len; j++){
                arr[temp] = str.substring(i, j+1);
                temp++;
            }
        }

        System.out.println(arr.toString());
    }
}