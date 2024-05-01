class A2{
    {
        System.out.println("parent non static multiline initilizers");
    }
    int x = 10;
    public void m1(){
        System.out.println("Hi from m1 method");
    }
    A2(){
        m1();
        System.out.println("Hi from parent constructor - no args");
    }
}

class B2 extends A2{
    {
        System.out.println("Child non static multi line initilizers");
    }
    int y = 20;
    public void m2(){
        System.out.println("Hi from m2 method");
    }
    B2(){
        m2();
        System.out.println("Hi from child constructor - no args");
    }

    public static void main(String[] args) {
        System.out.println("hi from main method");
        B2 ref = new B2();
        System.out.println("Bye from main method");
    }
}