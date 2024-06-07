package leet;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.*;

class two_sum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        // size and values in the array
        System.out.print("Enter the size of the array: "); int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter the " + i + "th position of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("array values you entered: " + Arrays.toString(arr));

        // target
        System.out.print("Enter the target value: ");int tar = sc.nextInt();
        int[] res = twoSum(arr,tar);
        System.out.println(Arrays.toString(res));    
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arr = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int cur = nums[i];
            int x = target - cur;
            if(arr.containsKey(x)){
                return new int[] {arr.get(x), i};
            }
            arr.put(cur,i);
        }
        return null;
    }
}