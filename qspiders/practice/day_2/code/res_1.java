package qspiders.day_2.code;
class res_1{
    public static void main(String[] args) {
        int a=10,b=10,c=-30;
        boolean res1 = (a==b) && (b>=c);
        boolean res2 = (res1 || false) && res1;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println((res1 != res2) == false);
    }
}

/*
output: 
true
true
true
 */