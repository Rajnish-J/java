package qspiders_practice.day_3.code;

class complex_condition_exp{
    public static void main(String[] args) {
        int year = 2023;
        boolean is_leap_year = ((year % 4 == 0 && year % 100 != 0) && year % 400 == 0);
        System.out.println(year + " is a leap year? ");
        System.out.println("Ans: " + is_leap_year);
    }
}
/*
output:
2023 is a leap year? 
Ans: false
 */