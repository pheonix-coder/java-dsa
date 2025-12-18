package searching;

// TC: O(n)
// SC: O(1)
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 11, 2, 3, 44 };
        int target = 2;

        int index = linearSearch(arr, target);

        if (index != -1)
            System.out.println(target + " is at " + index + " index of the array.");
        else
            System.out.println("Element is not in the array");
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}