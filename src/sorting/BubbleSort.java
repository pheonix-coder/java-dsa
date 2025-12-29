package sorting;

// TC: O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 2, 8, 9, 4 };

        System.out.println("Before Sorting");
        printArray(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    int t = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = t;
                }
            }
        }

        System.out.println("After Sorting");
        printArray(nums);
    }

    static void printArray(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}