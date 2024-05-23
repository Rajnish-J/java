// Chessboard Distance

// The Chessboard Distance for any two points (X1,Y1) and (X2,Y2) on a Cartesian plane is defined as max( |X1 - X2|, |Y1 - Y2| ). 
// You are given two points (X1,Y1) and (X2,Y2). Output their Chessboard Distance.
// Note that, | P | denotes the absolute value of integer P. For example, | -4 | = 4 and | 7 | = 7.

import java.util.*;

class Chessboard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x_one = sc.nextInt();
            int y_one = sc.nextInt();
            int x_two = sc.nextInt();
            int y_two = sc.nextInt();

            int x = x_one - x_two;
            int y = y_one - y_two;

            if(x<0){
                x = - x;
            }
            if(y<0){
                y = - y;
            }
            System.out.println(Math.max(x,y));
        }
    }
}