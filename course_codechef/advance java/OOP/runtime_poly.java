// Runtime Polymorphism
// Runtime polymorphism happens during runtime, when the program determines which method to call based on the actual object that is being referenced. 
// This is also known as method overriding.

// For example, let's say we have a class called Animal, and two subclasses called Dog and Cat. 
// The Animal class has a method called makeSound, and both the Dog and Cat classes override this method to make their respective sounds:

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark!");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class show
{
	public static void main (String[] args)
	{
	    // Since Dog is a subclass of Animal,
	    // the makeSound() method is overridden in the Dog class with the "Bark!" implementation.
		Animal myDog = new Dog();
        myDog.makeSound();

        // Similarly, makeSound() method is overridden in the Cat class with the "Meow!" implementation. 
        Animal myCat = new Cat();
        myCat.makeSound();
	}
}

// Now, when we create an object of type Animal, but assign it to a variable of type Dog or Cat, 
// we can call the makeSound method and it will call the appropriate method based on the actual object: