//Chef considers the number 7 lucky. 
//As a result, he believes that the 7-th letter he sees on a day is his lucky letter of the day.

//You are given a string S of length 10, denoting the first 10 letters Chef saw today.
//What is Chef's lucky letter?

import java.util.*;
class lucky_char {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int index = 6;
    char luckyLetter = s.charAt(index);
    System.out.println(luckyLetter);
    }
}
