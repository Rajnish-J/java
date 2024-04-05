class val_change {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int first_val = arr[0];

        for(int i = 0; i<arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = first_val;

        for(int i = 0; i<=arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
