import java.util.*;

class a11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 21){
            System.out.println("Eligible for marriage");
        }
        else{
            System.out.println("Not eligible for marriage");
        }
    }
}