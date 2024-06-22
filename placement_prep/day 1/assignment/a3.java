package assignment;
// swapping using temp
class a3 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap: " + a + " " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: " + a + " " + b);
    }    
}