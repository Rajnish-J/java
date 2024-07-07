// print A to Z

import java.util.*;

class p6{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1. Uppercase\n2. Lowercase");
        System.out.print("Enter the option: ");
        int option = sc.nextInt();

        switch (option){
            case 1: {
                int n = (int)'A';
                do{
                    System.out.print((char)n + " ");
                    n++;
                }
                while (n >= 65 && n <= 90);
            }
            case 2: {
                int n = (int)'a';
                do{
                    System.out.print((char)n + " ");
                    n++;
                }
                while (n >= 97 && n <= 122);
                break;
            }
            default:{
                System.out.println("Enter only the two options...");
            }
        }
    }
}