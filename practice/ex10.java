//? equals() method

// ! without overriding

// class book{
//     int bid;
//     double price;

//     book(){

//     }

//     book(int bid, double price){
//         super();
//         this.bid = bid;
//         this.price = price;
//     }

//     public static void main(String[] args) {
//         book b1 = new book(1, 100);
//         book b2 = new book(1, 100);

//         System.out.println(b1.equals(b2)); // false
//         System.out.println(b1.equals(b1)); // true
//     }
// }

// ! with overriding 

import java.lang.*;

class book extends Object{
    int bid;
    double price;

    book(){

    }

    book(int bid, double price){
        super();
        this.bid = bid;
        this.price = price;
    }

    @Override
    public boolean equals(Object o){
        boolean res = false;
        book b = (book)o;
        if(this.bid == bid && this.price == price){
            return true;
        }
        return res;
    }

    public static void main(String[] args) {
        book b1 = new book(1, 100);
        book b2 = new book(2, 200);

        System.out.println(b2.equals(b1));
//        System.out.println(b1.equals(b1));
    }
}