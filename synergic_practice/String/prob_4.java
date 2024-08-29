// ! Java Program to count the total number of vowels and consonants in a string

import java.util.*;

class prob_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String ip = sc.nextLine();
        int length = 0;
        int vowels = 0;

        for (int i = 0; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            if (ch != ' ') {
                length++;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowels++;
            }
        }
        System.out.println("The total consonants in the given sentence is: " + (length - vowels));
        System.out.println("The total vowles in the given sentence is: " + vowels);
    }
}