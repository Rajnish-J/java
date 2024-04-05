class lar_ele{
    public static void main(String[] args) {
        int[] array = {1,54,87,45};
        int max = 0;

        // checking loop
        for(int i = 0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("The largest element in the array: " + max);
    }
}