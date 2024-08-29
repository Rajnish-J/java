// ! Java Program to Count the Total Number of Punctuation Characters Exists in a String

// * What is the ASCII value of special characters? 
// * Special Characters (32–47 / 58–64 / 91–96 / 123–126): Special characters include all printable characters that are neither letters nor numbers. These include punctuation or technical, mathematical characters.

import java.util.*;

class prob_3 {
    public static void main(String[] args) {
        System.out.print("Enter the sentence: ");
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        int count = 0;

        for (int i = 0; i < ip.length(); i++) {
            int ch = (int) (ip.charAt(i));
            if ((ch >= 32) && (ch <= 47) || (ch >= 58) && (ch <= 64) || (ch >= 91) && (ch <= 96)
                    || (ch >= 123) && (ch <= 126)) {
                count++;
            }
        }
        System.out.println("The total special characters in the Sentences is: " + count);
    }
}