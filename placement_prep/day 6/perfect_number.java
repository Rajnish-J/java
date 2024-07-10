import java.util.*;

class perfect_number{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the start number: ");
        int start = sc.nextInt();
        System.out.print("Enter the end number: ");
        int end = sc.nextInt();

        if(start > 0){
            for(int j = start; j<= end; j++){
                int num = j;
                int res = 0;

                for(int i = 1; i<=num/2; i++){
                    if(num % i == 0){
                        res += i;
                    }
                }
                if(num == res){
                    System.out.print(res + " ");
                }
            }
        }
        else{
            System.out.println("Enter the start number greater than zero...");
        }
    }
}