package sorting;

// TC: O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 2, 8, 9, 4 };

        System.out.println("Before Sorting");
        printArray(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j])
                    minIndex = j;
            }

            int t = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = t;
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