import java.util.*;

class perfect_square{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        String ans = "Not a perfect square number";
        int num = sc.nextInt();

        for(int i = 1;i*i<= num; i++){
            if((num % i== 0) && (num / i == i)){
                ans = "Perfect square number";
                break;
            }
        }
        System.out.println(ans);
    }
}