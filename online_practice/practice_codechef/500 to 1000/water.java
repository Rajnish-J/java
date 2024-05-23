// Chef has three water bottles. At any point, if at least two of them are empty, she will fill them up. 
// But if at most one bottle is empty, she will wait, and not fill them up now.

// You are given three integers - B1, B2 and B3. 
// if B1 = 1, it means that the first bottle is full.
// If B1 = 0, it means that the first bottle is empty.
// Similarly, B2 denotes whether the second bottle is full or empty, and B3 denotes it for the third bottle.

// Output "Water filling time", if Chef has to fill the bottles now. If not, output "Not now".

import java.util.*;

class filling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();

            System.out.println((b1+b2+b3)<2?"Water filling time":"Not now");


        }
    }
}