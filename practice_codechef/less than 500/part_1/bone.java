// Trick or treat, bags of sweets, ghosts are walking down the street

// It's Halloween and Suri Bhai is out to get his treats.
// There are two sectors in his neighborhood, "Bones" and "Blood". They have N and M people, respectively.

// Each person in "Bones" will hand out X treats, and each person in "Blood" will hand out Y treats.
// How many treats does Suri Bhai get from visiting everyone in his neighborhood in total?

import java.util.*;
class Bone
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
        int num1 = N * X;
        int num2 = M * Y;
        int res = num2 + num1;
        System.out.println(res);
    }
}