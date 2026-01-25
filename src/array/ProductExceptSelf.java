package array;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        // Prefix and Suffix Product arrays

        // TC - O(N)
        // SC - O(N)
        // int n = nums.length;
        // int[] prefixProd = new int[n];
        // int[] suffixProd = new int[n];

        // prefixProd[0] = 1;
        // for (int i = 1; i < n; ++i)
        //     prefixProd[i] = prefixProd[i - 1] * nums[i - 1];
        // suffixProd[n - 1] = 1;
        // for (int i = n - 2; i >= 0; --i)
        //     suffixProd[i] = suffixProd[i + 1] * nums[i + 1];

        // for (int i = 0; i < n; ++i)
        //     nums[i] = prefixProd[i] * suffixProd[i];

        // return nums;

        // TC - O(N)
        // SC - O(1) - exclude res
        int n = nums.length;
        int[] res = new int[n];
        
        int prefix = 1;
        res[0] = 1;
        for (int i = 1; i < n; ++i) {
            res[i] = prefix * nums[i - 1];
            prefix *= nums[i - 1];
        }
        
        int suffix = 1;
        for (int i = n - 1; i > 0; --i) {                
            res[i] = suffix * res[i];
            suffix *= nums[i];
        }
        res[0] = suffix;

        return res;
    }
}