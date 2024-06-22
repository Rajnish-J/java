import java.util.*;

class p7{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the required time: ");
        int time = sc.nextInt();
        String feedback = "";

        if(time >= 2 && time <= 3){
            feedback = "Highly efficiently";
        }
        else if(time >= 3 && time <= 4){
            feedback = "Imporve speed";
        }
        else if(time >= 4 && time <= 5){
            feedback = "Traing to Improve speed";
        }
        else if(time >= 5){
            feedback = "Please leave the company";
        }
        System.out.println("Feedback: " + feedback);
    }
}