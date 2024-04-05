class even{
    public static void main(String[] args) {
        int num = 1234;
        while(num > 0){
            int rem = num % 10;
            int temp = num / 10;
            if(rem % 2 == 0){
                System.out.print(rem + " ");
            }
            num = temp;
        }
    }
}