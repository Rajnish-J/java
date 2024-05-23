class strings{
    public static void main(String[] args) {
        
        // creating a string and printing:
        String fruit = "Apple";
		System.out.println(fruit);
        System.out.println("-------------------");


        //String concatination using two strings:
        String x = "Hello";
		String y = "World";
	    System.out.println(x + " " + y);
        System.out.println("-------------------");


        //numbers could not added in the string, instead of addition the numbers 
        //also considered as string in the string datatype so numbers also concatinated...
        String z = "25";
        String a = "69";
        System.out.println(z + a);
        System.out.println("-------------------");


        //Finding the length of the string using lenght function: syntax: int a = variable.length();
        //variable is considered as the variable for the string...
        String txt = "NumeroTres";
        int len = txt.length();
        System.out.println("The length of the word is: " + len);
        System.out.println("-------------------");


        //Indexing: We use the concept of indexing to find the position of a character in a string, 
        //which means every character in a string corresponds to a number/position called the index number.
        
        //We use the indexOf() method which returns the index (the position) of the first occurrence of a specified text in a string,
        //this also includes whitespaces:

        //Note - Indexing always starts from 0 when going left to right.

        //To access the value of a specific character in a string, we refer to the index number, and use the charAt() method.
        //Example:
        String word = "Programming";
        System.out.println("Indexed word position of 2 and 1:");
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(1));
    }
}