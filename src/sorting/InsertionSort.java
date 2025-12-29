package sorting;

// TC: O(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 2, 8, 9, 4 };

        System.out.println("Before Sorting");
        printArray(nums);

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key;
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