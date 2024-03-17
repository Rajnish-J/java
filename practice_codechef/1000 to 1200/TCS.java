/*
TCS Examination

Two friends, Dragon and Sloth, are writing a computer science examination series. There are three subjects in this series. DSA, TOC, and DM. 
Each subject carries 100 marks.

You know the individual scores of both Dragon and Sloth in all 3 subjects. You have to determine who got a better rank.

The rank is decided as follows:

* The person with a bigger total score gets a better rank
* If the total scores are tied, the person who scored higher in DSA gets a better rank
* If the total score and the DSA score are tied, the person who scored higher in TOC gets a better rank
* If everything is tied, they get the same rank.
 */

import java.util.*;

class TCS{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0){
            int[] Dragon_mark = new int[3];
            int[] Sloth_mark = new int[3];
            int Dragon_avg = 0;
            int sloth_avg = 0;

            for(int i = 0; i<3;i++){
                Dragon_mark[i] = sc.nextInt();
                Dragon_avg += Dragon_mark[i];
            }
            for(int i = 0; i<3;i++){
                Dragon_mark[i] = sc.nextInt();
                sloth_avg += Sloth_mark[i]; 
            }
            for(int i = 0; i<3;i++){
                Dragon_avg += Dragon_mark[i]; 
            }
            for(int i = 0; i<3;i++){
                sloth_avg += Sloth_mark[i]; 
            }


            if(Dragon_avg > sloth_avg){
                System.out.println("Dragon");
            }
            else if(Dragon_avg < sloth_avg){
                System.out.println("Sloth");
            }
            else{
                if(Dragon_mark[0] > Sloth_mark[0]){
                    System.out.println("Dragon");
                }
                else if(Dragon_mark[0] < Sloth_mark[0]){
                    System.out.println("Sloth");
                }
                else{
                    if(Dragon_mark[1] > Sloth_mark[1]){
                        System.out.println("Dragon");
                    }
                    else if(Dragon_mark[1] < Sloth_mark[1]){
                        System.out.println("Sloth");
                    }
                    else{
                        System.out.println("Tie");
                    }
                }
            }
        }
    }
}