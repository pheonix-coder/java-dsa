package array;

public class SubarraySum {
    public static void main(String[] args) {
        int nums[] = { 10, 5, 2, 7, 1, 9 }, k = 15;

        int maxLen = 0;
        int sum = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // expand
            sum += nums[j];

            // shrink
            while (sum > k) {
                sum -= nums[i];
                i++;
            }

            // check
            if (sum == k) {
                maxLen = Math.max(maxLen, j-i+1);
            }
        }

        System.out.println("Longest subarray length = " + maxLen);
    }
}