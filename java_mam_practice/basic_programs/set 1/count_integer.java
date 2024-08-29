import java.util.*;

class count_integer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, count;
        boolean check = false;

        do {
            num = sc.nextInt();
            count = 0;
            if (num < 0) {
                System.out.println("Number cannot be negative, enter positive number: ");
                check = true;
            }

            while (num > 0) {
                num = num / 10;
                count++;
                check = false;
            }
        } while (check);
        System.out.println(count);
    }
}