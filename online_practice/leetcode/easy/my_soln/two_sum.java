package my_soln;

import java.util.*;

public class two_sum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter the size of the array: "); int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter the " + i + "th position of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("array values you entered: " + Arrays.toString(arr));

        // target
        System.out.print("Enter the target value: ");int tar = sc.nextInt();
        twoSum(arr, tar);
        
    }
    public static void twoSum(int[] nums, int target){
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    System.out.println("[" + i + ", " + j + "]");
                    break;
                }
            }
        }
    }
}