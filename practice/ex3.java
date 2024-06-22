class ex3 {
    int a = 30;
    ex3(){
        this(4);
        System.out.println("Java");
    }
    ex3(int a){
        this("Hi", 45);
        System.out.println("SQL");
    }
    ex3(String a, int b){
        System.out.println("web");
    }
    
    public static void main(String[] args) {
        System.out.println("hi");
        ex3 e = new ex3();
    }
}
