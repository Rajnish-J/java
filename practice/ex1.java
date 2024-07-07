// 08.17
// 08.41
class ex1{
    static{
        System.out.println("MLSI");
    }
    static double a = 15;
    int b = 14;
    {
        System.out.println("MLNSI");
    }
    public void m2(){
        System.out.println("Non static method");
    }

    public static void m1(){
        System.out.println("static method");
    }
    public static void main(String[] args) {
        System.out.println("Hi from main");
        ex1 e = new ex1();
        System.out.println("bye");
    }
}