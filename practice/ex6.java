// private members could not inherit

class A_2{

    int x = 10;
    {
        System.out.println("Parent MLNSI");
    }
    public void m1(){
        System.out.println("JAVA");
    }
    A_2(){
        System.out.println("Parent constructor");
    }
}

class B_2 extends A_2{
    {
        System.out.println("Child MLNSI");
    }
    int y = 20;
    public void m1(){
        System.out.println("SQL");
    }
    B_2(){
        super();
        System.out.println("Child constructor");
        System.out.println(x);
    }
}

class wbt_1{
    public static void main(String[] args) {
        System.out.println("hi");
        B_2 b = new B_2();
    }
}