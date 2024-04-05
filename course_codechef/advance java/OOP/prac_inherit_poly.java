// Practice - Inheritance and Polymorphism

// Write a program to do the following

// Create a superclass called Vehicle with properties make, model, year.
// Create a subclass called Car that inherits from Vehicle and adds a new property called numDoors 
// and a method displayInfo to display all the values assigned to the properties.
// Create an object of the Car class and call the displayInfo method.

class Vehicle {
    String make;
    String model;
    int year;
 }
 
 class Car extends Vehicle {
    int numDoors;
    
    public void displayInfo() {
       System.out.println("Make: " + make);
       System.out.println("Model: " + model);
       System.out.println("Year: " + year);
       System.out.println("Doors: " + numDoors);
    }
 }
 
 class car {
    public static void main(String[] args) {
       Car myCar = new Car();
       myCar.numDoors = 4;
       myCar.make = "Toyota";
       myCar.model = "Camry";
       myCar.year = 2021;
       myCar.displayInfo();
    }
 }
 