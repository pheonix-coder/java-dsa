package sorting;

// TC: O(n log(n))
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 2, 8, 9, 4 };

        System.out.println("Before Sorting");
        printArray(nums);

        mergeSort(nums, 0, nums.length - 1);

        System.out.println("After Sorting");
        printArray(nums);
    }

    static void mergeSort(int[] nums, int l, int r) {
        if (r <= l)
            return;

        int m = (l + r) / 2;

        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, r);

        merge(nums, l, m, r);
    }

    static void merge(int[] nums, int l, int m, int r) {
        int[] res = new int[r - l + 1];
        int i = l;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= r) {
            if (nums[i] > nums[j]) {
                res[k] = nums[j];
                j++;
            } else {
                res[k] = nums[i];
                i++;
            }
            k++;
        }
        while (i <= m) {
            res[k] = nums[i];
            i++;
            k++;
        }
        while (j <= r) {
            res[k] = nums[j];
            j++;
            k++;
        }

        for (i = l; i <= r; i++) {
            nums[i] = res[i - l];
        }
    }

    static void printArray(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
