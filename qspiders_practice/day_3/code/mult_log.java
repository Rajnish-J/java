package qspiders_practice.day_3.code;

 class mult_log {
    public static void main(String[] args) {
        int num = 15;
        boolean is_in_range = ((num > 0) && (num < 10) || num == 20);
        System.out.println("Is the number in range? ");
        System.out.println("Ans: " + is_in_range);
    }    
}
/*
output: 
Is the number in range? 
Ans: false
 */