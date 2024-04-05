class reverse {
    public static void main(String[] args) {
        int num = 2314;
        int reversed = 0;
        while(num > 0){
            int rem = num % 10;
            reversed = rem + reversed*10;
            int temp = num / 10;
            num = temp;
        }
        System.out.println(reversed);
    }    
}
