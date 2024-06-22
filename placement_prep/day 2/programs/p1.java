import java.util.*;

class switch_1{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case 'A' : 
            case 'E' : 
            case 'I' : 
            case 'O' : 
            case 'u' : {
                System.out.println(ch + " : is vowel");
                break;
            }
            default : {
                System.out.println("Consonants");
                break;
            }
        }
    }
}