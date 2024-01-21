// In Chefland, there are X schools, and each school has Y students. The year end results are in and a total of Z students passed the exams.

// Assuming that all students appeared for the exams, 
// find whether the number of students who passed in Chefland was strictly greater than 50%.

import java.util.*;
class exams{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int school = sc.nextInt();
            int students = sc.nextInt();
            int appeared_students = sc.nextInt();

            System.out.println((school * students) / 2 < appeared_students ? "YES" : "NO");
        }
    }
}