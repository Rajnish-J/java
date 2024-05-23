import java.io.*;
import java.util.*;

class employee{
    static Scanner sc = new Scanner(System.in);
    Properties pro = new Properties();
    public static final String FILE_NAME = ("Employee.properities");

    public employee(){
        loadProperities();
    }

    private void loadProperities(){
        try{
            FileInputStream fi = new FileInputStream(FILE_NAME);
            pro.get(FILE_NAME);
        }
        catch(FileNotFoundException e){
            System.out.println("**************");
        }
    }

    private void saveProperities(){
        try{
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            pro.save(fos,FILE_NAME);
        }
        catch(FileNotFoundException e){
            System.out.println("*************");
        }
    }

    public static void main(String[] args) {
        employee e = new employee();
        while (true) {
            System.out.println(" 1. Insert the data\n 2. update the date\n 3. select the data\n 4. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1: {
                    System.out.print("Enter the employee no: ");
                    String e_id = sc.next();
                    System.out.print("Enter the employee name: ");
                    String e_name = sc.next();
                    e.saveProperities();
                }
            }
        }
    }
}