// Fix this

import java.util.*;

public class str_manip_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ip = "abc";
        String res = "";

        for(int i = 0; i<ip.length(); i++){
            int count = 1;
            for(int j = i+1; j<ip.length(); j++){
                if(i == j){
                    count++;
                }
                else{
                    i = i+count;
                }
                res = res + (ip.charAt(i) + count);
            }
        }
        System.out.print(res);
    } 
}