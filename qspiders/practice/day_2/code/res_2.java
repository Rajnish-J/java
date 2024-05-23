package practice.day_2.code;

class res_2{
    public static void main(String[] args) {
        double a = 3.14, b = a;
        boolean res1 = ((a>=b && 'Z' >= 'A') || (true && 'd' < 'z'));
        System.out.println(res1);
        System.out.println(((res1 != res1) || true) && 5>3);
    }
}
/*
output:
true
true
 */