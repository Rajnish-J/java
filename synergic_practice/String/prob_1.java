// ! Java Program to count the total number of characters in a string
// * if we use length method it will count also the spaces between the sentences

import java.util.*;

class prob_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String ip = sc.nextLine();
        int count = 0;

        for(int i = 0; i<ip.length(); i++){
            char ch = ip.charAt(i);
            if(ch != ' '){
                count++;
            }
        }
        System.out.println("The total characters in the given sentence is: " + count);
    }    
}
