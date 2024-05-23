class a {
    int x = 10;
    public static void test(){
        System.out.println("JAVA");
    }
}

class b extends a{
    int y = 20;
    public static void test(int a){
        System.out.println("JS");
    }

    public static void main(String[] args) {
        test(56);
        test();
        a.test();

        a ref = new b();
        ref.test();
    }
}
