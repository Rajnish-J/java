class d{
    static int m = 10;
}

class e extends d{
    static int m = 20;

    public static void main(String[] args) {
        d ref1 = new e();
        System.out.println(m);
        System.out.println(d.m);
        System.out.println(ref1.m);
        e ref2 = new e();
        System.out.println(m);
        System.out.println(d.m);
        System.out.println(ref2.m);
    }
}