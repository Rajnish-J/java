class array{
    public static void main(String[] args) {
        
        //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

        //To declare an array,
        // * Define the variable type followed by square brackets,
        // * Specify the name of the array and
        // * Specify the number of elements it should store.

        String[] num = {"1", "2", "3", "4", "5"};
        //here the [] declares the sring assigning operator, we use "Strings" that stores the block of memory and stores strings...
		System.out.println("Done");
        System.out.println("---------------------");


        //We learned that we can use indexing to access characters of a string. 
        //We can use the same technique to access an element of an array by referring to the index number inside square brackets [].

        int[] number = {1, 2, 3, 4, 5};
        //here the [] declares the int assigning operator, we use "integers" that stores the block of memory and stores integers...
		System.out.println(number[2]);
        System.out.println("---------------------");


        //To find the size of an array we use the length property.

        int[] num1 = {10,20,30,40,50,60};
		System.out.println(num1.length);
        System.out.println("---------------------");
    }
}