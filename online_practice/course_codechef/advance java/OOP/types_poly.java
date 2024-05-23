// Types of Polymorphism - Compile-time
// There are two types of polymorphism: Compile-time and Runtime Polymorphism.

// Compile-time polymorphism happens when the compiler determines which method to call during the compilation phase, based on the number of arguments and their types. 
// This is also known as method overloading.

// For example, let's say we have a class called Calculator, and we want to add two numbers. We can define two methods with the same name, but different parameters:

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}


class calculate {
   public static void main(String[] args) {
        Calculator calc1 = new Calculator();

        // add method is called on calc1 with two integer values (5 and 3).
        int one = calc1.add(5, 3);
        System.out.println(one);
        
        // add method is called on calc2 with two double values (5.0 and 3.0).
        double two = calc1.add(5.0,3.0,4.0);
        System.out.println(two);
   }
}