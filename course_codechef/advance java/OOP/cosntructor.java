// What are Constructors
// Let's learn about Constructors and how important they are.

// Think of constructors as the birth certificate or the initialization ceremony of an object. 
// When you create an object in Java, it needs to be initialized with some initial values or properties. 
// Constructors are used to initialize these properties and prepare the object for use.
// Let's take an example to understand this better. Suppose we have a class called Person which has some properties like name, age, and address. 
// Here's how you would create an object of this class without using a constructor:

class Person {
  String name;
  int age;
  String address;

  //Create a class constructor for the 'Person' class
  public Person(String n, int a, String addr) {
    name = n;
    age = a;
    address = addr;
  }
}

class construct{
    public static void main(String[] args) {   
        
        // Create an object of class 'Person' (This will call the constructor)  
        Person p = new Person("John", 25, "123 Main St");
        System.out.println(p.name + " is " + p.age + " and lives at " + p.address);        
    }
}