class student{
    
    //states
    static int sid;
    static String sname;
    static int marks;

    //constructor
    public student(){

    }

    public student(int sid, String sname, int marks){
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
    }

    //behaviour
    public static void detailsOfStudent(){
        System.out.println("Student ID: " + sid);
        System.out.println("Student name: " + sname);
        System.out.println("Student marks: " + marks);
        System.out.println("*****************");
    }
}