// What is Inheritance
// In Java, inheritance allows you to create a new class that is a modified version of an existing class. 
// The new class is called the subclass, and the existing class is called the superclass. 
// The subclass inherits all the methods and variables of the superclass, and can also add its own methods and variables.

// Let's say you have a class called "Animal" that has some basic methods and variables like "eat" and "sleep". 
// You want to create a new class called "Dog" that has all the methods and variables of "Animal", but also has its own methods and variables like "bark" and "breed". 
// Instead of creating a completely new class from scratch, you can use inheritance to create a subclass of "Animal" called "Dog".

// The code for the example will look something like this:

class Animal {
  public void eat() {
    System.out.println("Animal is eating.");
  }
  
  public void sleep() {
    System.out.println("Animal is sleeping.");
  }
}

class Dog extends Animal {
  public void bark() {
    System.out.println("Dog is barking.");
  }
  
  public void breed() {
    System.out.println("Dog is breeding.");
  }
}

// In this example, "Dog" is a subclass of "Animal". 
// It inherits all the methods and variables of "Animal" (i.e. "eat" and "sleep"), and also has its own methods and variables (i.e. "bark" and "breed").