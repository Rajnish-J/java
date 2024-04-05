// Practice - Methods
// Let's try a few exercises practice what we learnt
// Task

// Create a class called Person with properties name and age.
// Add a method called introduce that outputs "Hi, my name is {name} and I am {age} years old."
// Create a Person object and call the introduce method on it.

class Person {
    
    // Define the attributes "name" and "age"
    String name;
    int age;
    
    
    // Create a method "introduce" and add the greeting in a print statement
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

class check {
    public static void main(String[] args) {
        
        // Create an object of the class "Person"
        Person me = new Person();
        me.name = "Chef";
        me.age = 27;
        
        me.introduce(); // Outputs "Hi, my name is Chef and I am 27 years old."
    }
}
