import java.util.*;

class p3{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the current units: ");
        int unit = sc.nextInt();
        float amount = 0f;
        float tax = 0.2f;

        if(unit < 0){
            System.out.println();
        }
        else if(unit >=1 && unit <= 49){
            amount = unit * 0.5f;
        }
        else if(unit >= 50 && unit <= 149){
            amount = unit * 0.75f;
        }
        else if(unit >= 150 && unit <= 249){
            amount = unit * 1.20f;
        }
        else if(unit >= 250){
            amount = unit * 1.50f;
        }

        System.out.println(unit >= 0? ("Bill: " + amount * tax) : "Current unit could not be negative");
    }
}