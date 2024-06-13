class max_arr_ele {
    public static void main(String[] args) {
        int[] arr = {5,10,-1,14,-7,21,-3,1};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }    
}