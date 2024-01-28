import java.util.*;

class evenword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        evenlengths(input);
    }
    public static void evenlengths(String sentence){
        String[] word = sentence.split(" ");

        for(String words : word){
            if(words.length() % 2 == 0){
                System.out.println(words);
            }
        }
    }    
}
