package assn;

import java.util.*;

class rem_cons_char{
    static Scanner sc = new Scanner(System.in);
    public static String solve(String A, int B) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < A.length()) {
            char currentChar = A.charAt(i);
            int count = 0;
            
            while (i < A.length() && A.charAt(i) == currentChar) {
                count++;
                i++;
            }
            
            if (count != B) {
                for (int j = 0; j < count; j++) {
                    result.append(currentChar);
                }
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        
        String a = sc.next();
        int b = sc.nextInt();
        System.out.println(solve(a,b));
    }
}