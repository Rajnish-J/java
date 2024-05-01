class vehicle{
    // states
    int no_of_wheels;
    String reg_no;
    static String owner = "Girish sir";

    //cons

    public vehicle(){
        //LNSM
    }
    public vehicle(int no_of_wheels, String reg_no){
        //LNSM
        this.no_of_wheels = no_of_wheels;
        this.reg_no = reg_no;
    }
}

class bike extends vehicle{
    //states
    String bname;
    double price;

    //const
    public bike(){
        super();
        // LNSM
    }
    
    public bike(String bname, double price, int no_of_wheels, String reg_no){
        super(no_of_wheels, reg_no);
        //LNSM
        this.bname = bname;
        this.price = price;
    }

    public void detailsOfBike(){
        System.out.println("Bike name: " + bname);
        System.out.println("Bike price: " + price);
        System.out.println("Bike total wheels: " + no_of_wheels);
        System.out.println("Bike registet name: " + reg_no);
        System.out.println("Bike owner name: " + owner);
    }
}

class wbt{
    public static void main(String[] args) {
        bike b1 = new bike("RX-100", 80000, 2, "KA-13 T3429");
        bike b2 = new bike("TVS-XL", 70000, 2, "TN-10 T1234");

        b1.detailsOfBike();
        b2.detailsOfBike();
    }
}