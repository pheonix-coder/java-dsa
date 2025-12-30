package sorting;

// TC: O(n log(n))
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 2, 8, 9, 4 };

        System.out.println("Before Sorting");
        printArray(nums);

        quickSort(nums, 0, nums.length-1);

        System.out.println("After Sorting");
        printArray(nums);
    }

    static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);

            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }

    static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            int t = nums[i+1];
            nums[i+1] = nums[high];
            nums[high] = t;
        }

        return i+1;
    }

    static void printArray(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}