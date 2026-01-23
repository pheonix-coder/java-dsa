package array;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 }, target = 9;

        int result[] = twoSum(nums, target);
        if (result[0] == -1) {
            System.out.println("No two numbers sum to " + target);
        } else {
            System.out.println(target + " = " + nums[result[0]] + " + " + nums[result[1]]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // Brute Force

        // TC - O(N^2)
        // SC - O(1)
        // for (int i = 0; i < nums.length; i++) 
        //     for (int j = i + 1; j < nums.length; j++) 
        //         if (nums[i] + nums[j] == target) 
        //             return new int[]{i, j};
        
        // return new int[]{-1, -1};
        
        // Better Approach
        
        // TC - O(N)
        // SC - O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];
            
            if (map.containsKey(toFind)) {
                return new int[]{map.get(toFind), i};
            }
            
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
        
        // For Sorted Arrays
        
        // TC - O(N + NlogN)
        // SC - O(1)
        
        // int i = 0, j = nums.length - 1;
        // while (i < j) {
        //     int sum = nums[i] + nums[j];
            
        //     if (sum == target) return new int[]{i, j};
            
        //     else if (sum > target) j--;
        //     else i++;
        // }
        // return new int[]{-1, -1};
    }
}
