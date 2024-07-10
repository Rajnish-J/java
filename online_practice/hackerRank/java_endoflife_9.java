/*
Description: https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
 */

import java.util.Scanner;

public class java_endoflife_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNext()){
            String ip = sc.nextLine();
            System.out.println(i + " " + ip);
            i++;
        }
    }
}