import java.util.*;

class p4{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int per_price = 5;
        System.out.print("Enter the quantity: ");
        int qty = sc.nextInt();
        float amt = 0f;
        float bill = 0f;

        if(qty >= 0){
            //should provide 10%
            amt = qty * per_price;
            bill = (float)(amt - (amt*0.1));
        }
        else{
            //no discount
            amt = qty * per_price;
            bill = (float)(amt);
        }
        System.out.println("Quantity: " + qty);
        System.out.println("Price: " + per_price);
        System.out.println("Total bill: " + bill);
    }
}