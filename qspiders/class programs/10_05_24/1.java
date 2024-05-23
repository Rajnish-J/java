class vehicle{
    public void speed(){
        System.out.println("Vehicle speed");
    }

    public void name(){
        System.out.println("Vehicle name");
    }
}

class bike extends vehicle{
    //override
    public void naem(){
        System.out.println("Ninja");
    }
}

class vehicle_bike_driver{
    public static void main(String[] args) {
        vehicle v = new bike();
        v.name();
        v.speed();
    }
}