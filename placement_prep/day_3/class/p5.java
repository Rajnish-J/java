import java.util.*;

class p5{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("1.Male\n2. Female");
        System.out.print("choose the gender: ");
        int gender = sc.nextInt();
        System.out.println("1.Greater or equal than 10\n2.Lesser than 10");
        System.out.print("Choose the number for experience: ");
        int service = sc.nextInt();
        System.out.println("1.Post graduate\n2.Graduate");
        System.out.print("Enter the qualification: ");
        int qualification = sc.nextInt();
        double sal = 0;

        switch (gender){
            case 1:{
                switch(service){
                    case 1:{
                        switch(qualification){
                            case 1:{
                                sal = 15000d;
                                break;
                            }
                            case 2:{
                                sal = 10000d;
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        switch(qualification){
                            case 1:{
                                sal = 10000d;
                                break;
                            }
                            case 2:{
                                sal = 7000d;
                                break;
                            }
                        }
                        break;
                    }
                }
            break;
            }
            case 2: {
                switch(service){
                    case 1:{
                        switch(qualification){
                            case 1:{
                                sal = 12000d;
                                break;
                            }
                            case 2:{
                                sal = 9000d;
                                break;
                            }
                        }
                        break;
                    }
                    case 2:{
                        switch(qualification){
                            case 1:{
                                sal = 10000d;
                                break;
                            }
                            case 2:{
                                sal = 6000d;
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        break;
        }
        System.out.println(sal);
    }
}