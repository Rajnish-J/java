class perfect_number {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;

        for(int i = 1; i< num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        System.out.println((sum == num) ? "Perfect number" : "Not a perfect number");
    }
}
