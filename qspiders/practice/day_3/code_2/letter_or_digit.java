package qspiders.day_3.code_2;

class letter_or_digit {
    public static void main(String[] args) {
        char ch = '9';
        if((ch >= 'a' && ch <= 'z') && (ch >= 'A' && ch <= 'Z')){
            System.out.println("Letter");
        }
        if(ch >= '0' && ch <= '9'){
            System.out.println("Number");
        }        
    }
}
