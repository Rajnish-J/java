import java.util.*;

class a18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Capital alphabets");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("small alphabets");
        }
        else if(ch >= '1' && ch <= '9'){
            System.out.println("Integers");
        }
        else{
            System.out.println("Special characters");
        }
    }
}