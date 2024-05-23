class car{
    String name, color;
    double price;

    public car(String name){
        //LNSM
        this.name = name;
    }

    public car(String name, String color){
        //LNSM
        this.name = name;
        this.color = color;
    }

    public car(String name, String color, double price){
        //LNSM
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {
        System.out.println("HI");
    }
}