class poly{
    public static void min(){
        System.out.println("This function can find minimum number");
    }
    public static void min(int a){
        System.out.println(a);
    }
}

class call{
    public static void main(String[] args) {
        poly obj = new poly();
        obj.min();
        obj.min(5);
        
    }
}