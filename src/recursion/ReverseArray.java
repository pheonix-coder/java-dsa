package recursion;

import java.util.Arrays;

// TC - O(N/2)
// SC - O(N/2)
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        System.out.println(Arrays.toString(arr));

        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int s, int e) {
        if (s < e) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;

            reverse(arr, s + 1, e - 1);
        }
    }
}