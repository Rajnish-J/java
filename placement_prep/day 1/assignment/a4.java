package assignment;
// swap without using temp variable
class a4 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap: " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: " + a + " " + b);
    }
}
/*
a = 10
b = 20

a = 30
b = 10
a = 20
 */