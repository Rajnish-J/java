import java.util.*;

class anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user inputs: 
        String name_1 = sc.nextLine();
        String name_2 = sc.nextLine();

        // converting the strings into lower case
        name_1.toLowerCase();
        name_2.toLowerCase();

        // changing strings to char array:
        char[] char_1 = name_1.toCharArray();
        char[] char_2 = name_2.toCharArray();

        // sorting
        Arrays.sort(char_1);
        Arrays.sort(char_2);

        //checking for anagram
        System.out.println(Arrays.equals(char_1, char_2) ? "Anagram" : "Not an anagram");
    }
}