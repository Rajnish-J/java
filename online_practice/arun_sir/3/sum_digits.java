class sum_digits {
    public static void main(String[] args) {
        int num = 5978;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            int temp = num / 10;
            num = temp;
        }
        System.err.println(sum);
    }    
}
