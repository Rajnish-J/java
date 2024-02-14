// What is Polymorphism
// Alright, let's talk about Polymorphism in Java!

// Polymorphism is a fancy term that simply means "many forms". 
// In Java, it refers to the ability of an object to take on many forms, or in other words, to have multiple behaviors depending on the situation.

// To understand this better, let's take an example. Imagine you have a class called "Animal" with a method called "makeSound()" that prints the sound of the animal. 
// Now, let's say you have two subclasses of "Animal": "Dog" and "Cat". 
// Both of these subclasses inherit the "makeSound()" method from the "Animal" class, but they have different implementations of this method.

// So, when you create an object of "Dog" and call the "makeSound()" method, it will print the sound of a dog. 
// Similarly, when you create an object of "Cat" and call the same method, it will print the sound of a cat.

// This is the beauty of Polymorphism! Even though both "Dog" and "Cat" are "Animal" objects, they behave differently depending on their type.

// Now, let's see a piece of code to simplify things:

class Animal {
    public void makeSound() {
       System.out.println("Animal makes a sound");
    }
 }
 
 class Dog extends Animal {
    public void makeSound() {
       System.out.println("Dog barks");
    }
 }
 
 class Cat extends Animal {
    public void makeSound() {
       System.out.println("Cat meows");
    }
 }
 
 class Codechef {
    public static void main(String[] args) {
        
       // Both animal1 and animal2 are of type Animal,
       // but they refer to objects of their respective subclass types Dog and Cat.
       Animal animal1 = new Dog();
       Animal animal2 = new Cat();
 
       animal1.makeSound(); // Output: Dog barks, because it refers to a Dog object.
       animal2.makeSound(); // Output: Cat meows, because it refers to a Cat object.
    }
}

// Here, we have created two objects of type "Animal", but we have assigned them to the subclasses "Dog" and "Cat". 
// When we call the "makeSound()" method on these objects, it will print the sound of the respective animal subclass.

// This is Polymorphism in action! The same method behaves differently depending on the type of object it is called on... 