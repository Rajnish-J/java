// Recently Chef joined a new company. In this company, the employees have to work for X hours each day from Monday to Thursday. 
// Also, in this company, Friday is called Chill Day — employees only have to work for Y hours (Y<X) on Friday. 
// Saturdays and Sundays are holidays.

// Determine the total number of working hours in one week.

import java.util.*;

class office
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int weekdays = sc.nextInt();
            int Friday = sc.nextInt();

            if(Friday < weekdays){
            System.out.println((weekdays * 4) + (Friday * 1));
            }
        }
    }
}