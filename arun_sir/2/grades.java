import java.util.*;
class grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        if(mark>90){
            System.out.println("o grade");
        }
        else if((mark>80) && (mark<=90)){
            System.out.println("A+ grade");
        }
        else if((mark>70) && (mark<=80)){
            System.out.println("A grade");
        }
        else if((mark>60) && (mark<=70)){
            System.out.println("B+ grade");
        }
        else if((mark>50) && (mark<=60)){
            System.out.println("B grade");
        }
        else{
            System.out.println("FAIL");
        }
    }
} 
    