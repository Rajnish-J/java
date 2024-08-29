import java.util.*;

class largest_three
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a>c) && (a>b)){
            System.out.println(a + " is the greater number");
        }
        if((b>c) && (b>a)){
            System.out.println(b + " is the greater number");
        }
        if((c>a) && (c>b)){
            System.out.println(c + " is the greater number");
        }

        // ! another method

        
        // int largest = a; // Assuming num1 is the largest initially

        // if (b > largest) {
        //     largest = b;
        // }

        // if (c > largest) {
        //     largest = c;
        // }

        // System.out.println("The largest number is: " + largest);

        // // with ternary operator

        // largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        // System.out.println(largest);

    }
}