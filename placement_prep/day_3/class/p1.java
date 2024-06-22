import java.util.*;

class p1{
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter the marks: ");
        System.out.print("Enter the physics mark: ");
        float physics = sc.nextFloat();
        System.out.print("Enter the chemistry mark: ");
        float chemistry = sc.nextFloat();
        System.out.print("Enter the biology mark: ");
        float biology = sc.nextFloat();
        System.out.print("Enter the mathematics mark: ");
        float maths = sc.nextFloat();
        System.out.print("Enter the computer science mark: ");
        float comp_sci = sc.nextFloat();

        char ch = ' ';
        float num = (physics + chemistry + biology + comp_sci +maths)/5;

        if(num >= 90){
            ch = 'A';
        }
        else if(num >= 80){
            ch = 'B';
        }
        else if(num >= 70){
            ch = 'C';
        }
        else if(num >= 60){
            ch = 'D';
        }
        else if(num <= 40){
            ch = 'E';
        }
        System.out.println("The grade is: " + ch);
    }
}