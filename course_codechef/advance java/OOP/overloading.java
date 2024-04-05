// Method Overloading
// Let's discuss a related concept - Method overloading

// Method Overloading is when a class has two or more methods with the same name, but different parameters. 
// This allows us to reuse the method name, but with different functionality based on the input. Let's take a look at an example:

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

class method {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        
        System.out.println(myCalc.add(2, 3)); // Outputs 5
        System.out.println(myCalc.add(2, 3, 4)); // Outputs 9
    }
}