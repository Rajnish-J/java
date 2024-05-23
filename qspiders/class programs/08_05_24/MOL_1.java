class demo{
    public static void m1(){
        System.out.println("Java");
    }

    public static void m1(int a){
        System.out.println("Java script");
    }

    public void m1(double a){
        System.out.println("JSP");
    }

    public static void m1(double a, int b){
        System.out.println("SQL");
    }

    public static void main(String[] args) {
        demo d = new demo();
        m1();
        m1(5);
        m1(5, 16);
        d.m1(8.0);
    }
}