// Types of Inheritance
// There are different types of Inheritance supported in Java.

// Single inheritance is the most basic type of inheritance. It occurs when a subclass inherits from only one superclass. 
// Like in the example we saw previously where the Dog class now extends the Animal class.

// The next type is Multilevel inheritance. Multilevel inheritance occurs when a subclass inherits from a superclass, which in turn inherits from another superclass. 
// For example:

class Animal {
  public void eat() {
    System.out.println("The animal is eating.");
  }
}

class Mammal extends Animal {
  public void breathe() {
    System.out.println("The mammal is breathing.");
  }
}

class Dog extends Mammal {
  public void bark() {
    System.out.println("Woof woof!");
  }
}

// In this example, the Dog class inherits from the Mammal class, which in turn inherits from the Animal class. 
// This allows the Dog class to access all of the methods and properties of both the Mammal and Animal classes.