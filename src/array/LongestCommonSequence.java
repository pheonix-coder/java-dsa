package array;

import java.util.*;

public class LongestCommonSequence {
    public static void main(String[] args) {
        int[] nums = {1,44,3,666,2,5,4};

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        // Brute Force
        // Sorting + checking sequences
        // TC - O(N + NlogN)

        // Optimal
        // TC - O(N)
        // SC - O(N)
        Set<Integer> hash = new HashSet<>();
        for (int x : nums)
            hash.add(x);

        int max = 0;
        for (int x : hash) {
            if (!hash.contains(x - 1)) {
                int c = 1;
                while (hash.contains(x + c)) {
                    c++;
                }
                max = Math.max(c, max);
            }
        }

        return max;
    }
}