import java.util.*;

class perfect_number{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the start number: ");
        int start = sc.nextInt();
        System.out.print("Enter the end number: ");
        int end = sc.nextInt();

        if(start > 0){
            for(int i = start; i<= end; i++){
                int num = i;
                int res = 0;

                for(int j = 1; j<=num/2; j++){
                    if(num % j == 0){
                        res += j;
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