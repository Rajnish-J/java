import java.util.*;
class factors
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 2; i<= num/2; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}