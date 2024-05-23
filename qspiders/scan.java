package qspiders;


import java.util.*;
class arr_1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[]a=new int[size];// array_size = size(dependence of size variable)
        
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter the " + " " + i + " th " + "elements of the array: ");
            a[i] = sc.nextInt();
        }
        
        System.out.print("Wait, result generating.");
        
        for(int i = 0; i<20; i++){
            System.out.print(".");
            Thread.sleep(50);
        }
        System.out.println();

        Thread.sleep(2000);
        System.out.println("Array you created: " + Arrays.toString(a));
    }
}