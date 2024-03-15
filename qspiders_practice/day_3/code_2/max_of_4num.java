package qspiders_practice.day_3.code_2;

class max_of_4num {
    public static void main(String[] args) {
        int a = 7, b = 10, c = 17, d = 18;
        System.out.println((a>b && a>c && a>d)?a:((b>c && b>d) ? b : (c>d) ? c : d));
    }    
}
