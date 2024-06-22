class A_1{
    int x = 10;
    {
        System.out.println("Parent MLNSI");
    }
    public void m1(){
        System.out.println("JAVA");
    }
    A_1(){
        System.out.println("Parent constructor");
    }
}

class B_1 extends A_1{
    {
        System.out.println("Child MLNSI");
    }
    int y = 20;
    public void m1(){
        System.out.println("SQL");
    }
    B_1(){
        super();
        System.out.println("Child constructor");
    }
}

class wbt_1{
    public static void main(String[] args) {
        System.out.println("hi");
        B_1 b = new B_1();
    }
}