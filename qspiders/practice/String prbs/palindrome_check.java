import java.util.*;

class palindrome_check {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean do_repeat = true;
        do{
            System.out.println("Welcome to Palindrome checker: ");
            System.out.println("1. Check\n2. Exit");

            System.out.print("Enter the option: ");
            int input = sc.nextInt();
            
            switch (input) {
                case 1 : {
                    System.out.print("Enter the word to check: ");
                    String s1 = sc.next();
        
                    String s1_rev = reverse(s1);
                    System.out.println("Given word is: " + result(s1, s1_rev));

                    break;
                }
                case 2: {
                    do_repeat = false;
                    System.out.println("Thanks for using palindrome checker page....");
                    break;  
                }
            }
        }
        while(do_repeat);
    }
    
    public static String reverse(String s){
        String res = ""; 
        for(int i = s.length()-1; i>=0; i--){
            res += s.charAt(i);
        }
        return res;
    }

    public static String result(String s, String s_rev){
        String res = "";

        if(s.equals(s_rev)){res = "Palindrome String";}
        else{res = "Not a Palindrome String";}

        return res;
    }
}