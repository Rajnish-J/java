// Reference type converison

// In Java, we have two types of data: primitive types and reference types.

// Primitive types are the basic types like int, float, and boolean, we already saw how to convert one primitive type to another.

// Reference types are classes, interfaces, and arrays. Reference types store references to objects in memory, rather than storing the actual objects themselves.

// We already saw how to convert primitive types using implicit and explicit type conversion. Next, we'll see how Reference type conversion is done.


/*
 * Reference type conversion
Reference type conversion is the process of converting a reference variable from one type to another. 
This can be useful when you want to use an object of one class as an object of another class, or when you want to pass an object of one class as an argument to a method that expects an object of another class.

In simpler terms, it's like changing the label on a can - the can itself remains the same, but the way we refer to it changes.

For example, let's say we have a class called "Animal", and a subclass of Animal called "Cat". We can create an instance of Cat, and assign it to a variable of type Animal:

Cat myCat = new Cat();
Animal myAnimal = myCat;
Now, we can use the variable myAnimal to access the methods and properties of the Cat object, even though it is stored as a variable of type Animal.

Here's an example of code that works without using the concept of reference type conversion:

Cat myCat = new Cat();
myCat.meow();
This code will call the "meow" method of the Cat object. However, let's say we want to pass myCat to a method that expects an Animal object. We can do this using reference type conversion:

public void doSomething(Animal myAnimal) {
    myAnimal.eat();
}

Cat myCat = new Cat();
doSomething(myCat);
Now, we are passing myCat as an argument to a method that expects an Animal object. The doSomething method can access the methods and properties of the Cat object through the myAnimal variable.
 */

 import java.util.*;

 class Animal {
     public void eat() {
         System.out.println("Nom nom nom");
     }
 }
 
 class Cat extends Animal {
     public void meow() {
         System.out.println("Meow");
     }
 }
 
 class typeee
 {
     public static void main(String[] args) {
         // create a Cat object and assign it to a variable of type Animal
         Cat myCat = new Cat();
         Animal myAnimal = myCat;
         
         // access a method on the Cat object using the Animal reference
         myAnimal.eat();
         
         // pass the Cat object to a method that expects an Animal object
         doSomething(myCat);
     }
     
     public static void doSomething(Animal myAnimal) {
         // access a method on the Cat object using the Animal reference
         myAnimal.eat();
     }
 }