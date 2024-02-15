class largest{
    public static void main(String[] args) {
        int[] array = {11,25,45,78,4};
        int largest = 0;
        int size = array.length;

        //chcking loop
        for(int i = 0; i<size; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        System.out.println("The largest element in the array: " + largest);
    }
}