class Sort {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = {5, 2, 8, 1, 7};
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
