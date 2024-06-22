class A{
    int x = 10;
    public void m1(){
        System.out.println("JAVA");
    }
    A(){
        System.out.println("Parent constructor");
    }
}

class B extends A{
    int y = 20;
    public void m1(){
        System.out.println("SQL");
    }
    B(){
        super();
        System.out.println("Child constructor");
    }
}

class wbt{
    public static void main(String[] args) {
        System.out.println("hi");
        B b = new B();
    }
}