package array;

import java.util.*;

class First_N_Primes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter the number of prime numbers you need: ");
        int prime = sc.nextInt();
        int[] primes = new int[prime];
        int index = 0;
        int num = 2;
        
        while (index < prime) {
            if (isPrime(num)) {
                primes[index] = num;
                index++;
            }
            num++;
        }
        
        // System.out.println("The first 10 prime numbers are:");
        for (int val : primes) {
            System.out.print(val + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
