class wbt {
    public static void main(String[] args) {
        
        System.out.println("Student failed in the exam...");

        student[] s_arr = {
            new student(1, "Dinga", 75),
            new student(2, "Dingi", 26),
            new student(3, "manga", 17),
            new student(4, "mangi", 51),
        };

        for(student s : s_arr){
            if(student.marks <= 35){
                student.detailsOfStudent();
            }
        }
        System.out.println("***************");

        System.out.println("Laptop having price more than 50000");

        laptop[] l_arr = {
            laptop.getLaptopObj("Lenovo", "8GB", 53880),
            laptop.getLaptopObj("Aver", "4GB", 26000)
        };

        for(laptop l : l_arr){
            if(laptop.price > 50000){
                laptop.detailsOfLaptop();
            }
        }
        System.out.println("***************");
    }    
}
