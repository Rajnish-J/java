import java.util.*;

class p6{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        String[] arr = {"Even","Odd"};
        System.out.println(arr[num&1]);
    }
}

/*

method 1:
    if(num % 2 == 0){
        System.out.print("Even);
    }
    else{
        System.out.print("odd");
    }
 */

 /*
    if(num & 1){
        System.out.print("even");
    }
    else{
    System.out.print("Odd");
    }
*/