class dance{
    public void singer(){
        System.out.println("I am singing");
    }
}

class dance_override extends dance{
    
    @Override
    public void singer(){
        System.out.println("Sang");
    }

    public static void main(String[] args) {
        dance d = new dance_override();
        d.singer();
        dance_override d1 = new dance_override();
        d1.singer();
    }
}