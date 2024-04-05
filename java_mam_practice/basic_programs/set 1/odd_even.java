import java.util.*;

class odd_or_even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num %2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    
    // another method...

        if((num & 1) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    
    // another method

        String[] arr = new String[]{"even","odd"};
        System.out.println(arr[num & 1]);
    
    
    }
}