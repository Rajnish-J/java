class virat{
    public static void main(String[] args) {
        int a=20, b=40;
        boolean res = ((a++ > b) && (b++ <a));
        System.out.println(a);
        System.out.println(b);
        System.out.println(res);
    }
}