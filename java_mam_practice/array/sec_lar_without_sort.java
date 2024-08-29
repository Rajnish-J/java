public class sec_lar_without_sort {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return Integer.MIN_VALUE; // Return the smallest value as a default.
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                // Update secondLargest before updating firstLargest
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
            return Integer.MIN_VALUE; // Return the smallest value as a default.
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99};

        int secondLargest = findSecondLargest(arr);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
