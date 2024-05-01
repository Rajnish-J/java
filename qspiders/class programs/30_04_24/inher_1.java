class A{
    int x = 10;
    public void m1(){
        System.out.println("A class test");
    }
    A(){
        m1();
        System.out.println("Hi from no args of parent class");
    }
}

class B extends A{
    int y = 20;
    public void m2(){
        System.out.println("B class test");
    }
    B(){
        m2();
        System.out.println("Hi from no agrs of child class");
    }
    
}

class WBT{
    public static void main(String[] args) {
        System.out.println("Hi");
        B ref = new B();
        System.out.println("bye");
    }
}