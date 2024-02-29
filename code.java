class example{
    public static void main(String[] args) {
        int x = 10, y = 20;
        char ch = 'A';
        boolean res1 = !(!(x>y || x<y) || false);
        // printing statements:
        System.out.println(!(res1 && res1) || false); 
    }
}
/*
output:
false
 */