class harsha{
    public void biryani(){
        System.out.println("Veg biriyani");
    }
}

class shekar extends harsha{

    @Override
    public void biryani(){
        System.out.println("Mutton biriyani");
    }

    public static void main(String[] args) {
        
        //? based on child reference output will be printed
        harsha h = new harsha();
        h.biryani(); // Veg biriyani

        shekar s = new shekar();
        s.biryani();// Mutton biriyani
    }
}