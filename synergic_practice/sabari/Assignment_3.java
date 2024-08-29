package sabari;
// ! converts small alphabets into capital alphabets

import java.util.Scanner;

public class Assignment_3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();
        String UpperCase = "";
        for (int i = 0; i < word.length(); i++) {
            int check_Ascii = (int)word.charAt(i);
            char check = word.charAt(i);
            if(check_Ascii >= 97 && check_Ascii <= 122){
                char ch = (char) (word.charAt(i) - 32);
                UpperCase += ch + "";
            }
            else{
                UpperCase += check;
            }
        }
        System.out.println("UpperCase :" + UpperCase);
        System.out.println("length of the String :" + UpperCase.length());
        System.out.println("SubString :" + UpperCase.substring(2, 4));
        System.out.println("First Character :" + UpperCase.charAt(0));
    }
}