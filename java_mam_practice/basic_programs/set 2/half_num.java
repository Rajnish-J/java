// ! spliting the number into half

import java.util.*;

class half_num {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        // int count = count(num);
        // int half_count = count / 2;

        // System.out.println(first_half(num, half_count));
        // int s = second_half(num, half_count);
        // System.out.println(s);

        String str_num = Integer.toString(num);
        int f_half = Integer.parseInt(str_num.substring(0,str_num.length()/2));
        System.out.println(f_half);
        int s_half = Integer.parseInt(str_num.substring(str_num.length()/2, str_num.length()));
        System.out.println(s_half);
    }

    // // * fetching first half
    // public static int first_half(int num, int half_count) {
    //     int res = 0;
    //     if (num > 0) {
    //         while (num > 0) {
    //             num /= 10;
    //             if (count(num) == half_count) {
    //                 res = num;
    //                 break;
    //             }
    //         }
    //     }
    //     else{
    //         res = -1;
    //     }
    //     return res;
    // }

    // // * fetching second half
    // public static int second_half(int num, int half_count) {
    //     int res = 0, check_num = num / 10, ret = 0, add_f = num ;
    //     // System.out.println(check_num);
    //     // System.out.println(num);

    //     if(num > 0){
    //         while (check_num > 0) {
    //             res = ((check_num % 10) * 10) + res;
    //             if(res == half_count){
    //                 ret = res;
    //                 break;
    //             }
    //             check_num /= 10;
    //         }
    //     }
    //     else{
    //         ret = -1;
    //     }
    //     return ret;
    // }

    // public static int count(int num) {
    //     int count = 0;
    //     while (num > 0) {
    //         count++;
    //         num /= 10;
    //     }
    //     return count;
    // }
}