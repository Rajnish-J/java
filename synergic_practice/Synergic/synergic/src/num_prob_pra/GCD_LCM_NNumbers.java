package num_prob_pra;

public class GCD_LCM_NNumbers {

    // Method to calculate GCD of two numbers
    public static int gcd(int a, int b) {
    	int small = Math.max(a, b);
    	int gcd = 0;
    	for (int i = small; i >= 1; i--) {
			if ((a % i == 0) && (b % i == 0)) {
				gcd = i;
				break;
			}
		}
    	return gcd;
    }

    // Method to calculate LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Method to calculate GCD of an array of numbers
    public static int gcdOfArray(int[] numbers) {
        int result = numbers[0];
        for (int i = numbers.length - 1; i >= 1; i--) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    // Method to calculate LCM of an array of numbers
    public static int lcmOfArray(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 18, 24, 36};

        int gcd = gcdOfArray(numbers);
        int lcm = lcmOfArray(numbers);

        System.out.println("GCD of the array is: " + gcd);
        System.out.println("LCM of the array is: " + lcm);
    }
}
