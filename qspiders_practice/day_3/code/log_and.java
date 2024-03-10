package qspiders_practice.day_3.code;

class log_and {
    public static void main(String[] args) {
        boolean is_sunny = true;
        boolean is_warm = true;
        boolean is_beachday = is_sunny && is_warm;
        System.out.println("It is a beach day? ");
        System.out.println(is_beachday);
    }    
}
/*
output: 
It is a beach day? 
true
 */