// Inheritance of static variables
 
class ex2 {
    static int a = 10;
    static int b = 20, c = 30;
}

class ex2_1 extends ex2{
    static  int d=40, e = 50, f = 60;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}