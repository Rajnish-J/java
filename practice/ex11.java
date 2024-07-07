class laptop extends Object{
    int price;
    int RAM;
    String name;
    public static void main(String[] args) {
        laptop l1 = new laptop();
        laptop l2 = new laptop();

        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
    }
}