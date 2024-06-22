import java.util.Scanner;

class p2_Skill{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("\t\t\tSelect the Skill"); 
        System.out.println("1.Java\n2.SQL\n3.Web-Tech");
        int input=sc.nextInt();//5
        if (input ==1 ){ 
            System.out.println("Shambu And Surya");
        }
        else if (input == 2){ 
            System.out.println("Bharath And Nagaraj And Neeraj & Shambhu");
        }
        else if (input == 3){ 
            System.out.println("Harish & Pavan & Surya");
        }
        else{
            System.out.println("Invalid");
        }
    }
}

/*
Select the Skill
1.Java
2.SQL
3.Web-Tech
1
Shambu And Surya
*/