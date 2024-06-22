import java.util.*;

class p8{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') && (ch >= 'a' && ch <= 'Z')){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not a alphabet");
        }
    }
}