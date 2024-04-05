import java.util.*;

class occ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int count = 0;

        char[] ch = str.toCharArray();
        for(int i = 0; i<ch.length;i++){
            if(ch[i] == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}