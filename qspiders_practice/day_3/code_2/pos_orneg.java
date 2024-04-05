package qspiders_practice.day_3.code_2;

class pos_orneg {
    public static void main(String[] args) {
        int num = 8;
        String check = num > 0 ? "Positive" : num < 0 ? "Negative" : "zero";
        System.out.println("The given number is: " + check);
    }    
}
/*
output;
The given number is: Positive
 */