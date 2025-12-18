package searching;

// TC: O(log n)
// SC: O(1)
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int target = 4;

        int index = binarySearch(arr, target);

        if (index != -1)
            System.out.println(target + " is at " + index + " index of the array.");
        else
            System.out.println("Element is not in the array");
    }

    public static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == target)
                return m;
            else if (arr[m] > target)
                e = m - 1;
            else
                s = m + 1;
        }
        return -1;
    }
}