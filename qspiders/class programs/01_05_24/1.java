class fruit{

    // states
    String origin = "India";
    int price = 100;

    //const
    fruit(){
        //LNSM
    }
}

class apple extends fruit{

    //states
    String name = "Apple", color = "Red", taste = "Sweet";

    apple(){
        super();
        // LNSM
    }

    public void detailsOfApple(){
        System.out.println("Origin" + origin);
        
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        apple ref = new apple();
        ref.detailsOfApple();
    }
}