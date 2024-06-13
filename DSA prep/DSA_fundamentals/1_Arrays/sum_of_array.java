class sum_of_array{
    public static void main(String[] args) {
        int[] arr = {10,3,-1,-8,7,12,3,15};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        int a = Integer.MAX_VALUE;
    }
}