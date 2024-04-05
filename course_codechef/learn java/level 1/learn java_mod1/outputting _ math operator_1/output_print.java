class codechef_module_1{
    public static void main(String[] args) {
        
        // print function, this prints the output in the same line...
		System.out.print(3 + 4);
		System.out.print(2 + 1);
        System.err.println("");
        System.out.println("-------------------------------------------");


        // print function, this prints the output in the separate linee...
        System.out.println(3 + 4);
		System.out.println(2 + 1);
        System.out.println("-------------------------------------------");


        //You can also have multiple outputs together in a single print statement.
        //They are joined together using the "+" operator.
		System.out.println((3 + 4) + "\n" + (2 + 1));
        System.out.println("-------------------------------------------");

        
        //If you want the output to be in the same line and have a space separate them,
        //We can use " " to act as an empty space in between multiple outputs.
        //We had seen previously that text has to be enclosed within brackets ("text")
        //An empty space is a blank space between brackets (" ")
        System.out.println((3 + 4) + " " + (2 + 1));
        System.out.println("-------------------------------------------");


        //If we want any other text in between the outputs we can provide that text inside " " sign.
        System.out.println((3 + 4) + " and " + (2 + 1));
        System.out.println("-------------------------------------------");


        // Example: using print function, we equated the area and perimeter of rectangle:
        // area - length * breadth 
        System.out.println("Area of the rectangle:");
		System.out.println(11*13);
		
		//perimeter - 2(length + breadth)
        System.out.println("Perimeter of the rectangle:");
		System.out.println(2 * (11 + 13));
        System.out.println("-------------------------------------------");
	}
}