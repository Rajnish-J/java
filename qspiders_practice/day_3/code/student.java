package qspiders_practice.day_3.code;

class student {
    public static void main(String[] args) {
        int age = 27;
        boolean is_student = false;
        boolean is_young_adult = ((age >= 18 && age <=30) && !is_student);
        System.out.println("Is the person is a young adult? ");
        System.out.println("Ans: " + is_young_adult);
    }    
}
/*
output:
Is the person is a young adult? 
Ans: true
 */