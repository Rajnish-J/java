// What are Methods
// Think of a method as a set of instructions that can be called upon to perform a specific task. 
// Methods allow you to break down a complex program into smaller, more manageable pieces, making it easier to read and maintain.

// Let's take an example to understand this better. Say we have a class called "Car" that has two properties, "make" and "model". 
// Without using methods, we might create an object like this:

class Car {
    String make;
    String model;
    
    // Create a method
    public void drive() {
        System.out.println("The " + make + " " + model + " is driving.");
    }
}

class me {
    public static void main(String[] args) {
        Car myCar = new Car(); // Create object
        myCar.make = "Toyota";
        myCar.model = "Camry";
        
        myCar.drive(); // Outputs "The Toyota Camry is driving."
    }
}