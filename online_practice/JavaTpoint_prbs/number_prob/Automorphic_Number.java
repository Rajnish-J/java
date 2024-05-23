import java.util.*;

class automorphic{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        String res = (num == last(num) ? "Automorphic number" : "Not an Automorphic number");
        System.out.println(res);

    }

    public static long square(long num){
        long sqr = num * num;
        return sqr;
    }

    public static long last(long num){
        long check = square(num);
        long last_ret = 0, count = 0, temp = check;
        while(temp > 0){
            temp/=10;
            count++;
        }
        if(count == 1 || count == 2){
            last_ret = check;
        }
        else if(count >= 3){
            last_ret = check % 100;
        }
        return last_ret;

    }

}