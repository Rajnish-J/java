// How to create Classes and Object
// To create a Class, we use the class keyword. A class name should always start with an uppercase letter.

class Rectangle
{
    int width;
    int height;
}

class Codechef
{
    public static void main(String[] args) {

        // create object 'rectangle'
        Rectangle rectangle = new Rectangle();
        
        // access width and height using dot operator and assign values
        rectangle.width = 5;
        rectangle.height = 3;
        
        System.out.println("Width: " + rectangle.width);
        System.out.println("Height: " + rectangle.height);
    }
}