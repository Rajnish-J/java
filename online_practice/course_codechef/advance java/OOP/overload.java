// Practice - Method Overloading
// Task

// Create a class called StringHelper with two methods named concatenate.
// One method takes in two strings and returns their concatenation.
// The other method takes in three strings and returns their concatenation.
// Create a StringHelper object and call both methods with appropriate parameters.

class StringHelper {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }
    
    public String concatenate(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }
}

class my {
    public static void main(String[] args) {
        
        StringHelper myHelper = new StringHelper();
        
        System.out.println(myHelper.concatenate("Hello", "world")); // Outputs "Helloworld"
        System.out.println(myHelper.concatenate("Hello", "world", "!")); // Outputs "Helloworld!"
    }
}