class laptop {

    //states
    static String name,RAM;
    static double price;

    //constructor
    laptop(){

    }

    private laptop(String name, String RAM, double price){
        this.name = name;
        this.RAM = RAM;
        this.price = price;
    }

    public static void detailsOfLaptop(){
        System.out.println("Laptop name: " + name);
        System.out.println("Laptop RAM: " + RAM);
        System.out.println("Laptop price: " + price);
    }

    //object creating method
    public static laptop getLaptopObj(String name, String RAM, double price){
        return new laptop(name, RAM, price);
    }
}
