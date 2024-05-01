class A3{
    static int m = 10;
    int x = 20;
    
    static{
        System.out.println("Java");
    }
    
    public static void m1(){
        System.out.println("HTML");
    }
    
    public static void m2(){
        System.out.println("JDBC");
    }

    {
        System.out.println("JSP");
    }

    A3(){
        System.out.println("Parent constructor");
    }
}

class B3 extends A3{
    static int n = 30;
    int y = 40;

    static{
        System.out.println("Django");
    }

    public static void m3(){
        System.out.println("Python");
    }

    public static void m4(){
        System.out.println("Power tools");
    }

    {
        System.out.println("JMS");
    }

    B3(){
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        System.out.println("hi");
        B3 refernce = new B3();
        System.out.println("Bye");
    }
}