package array;

import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 4, 5 };

        // Brute Force
        // TC - O(N + NlogN)
        // SC - O(N)

        // Set<Integer> set = new LinkedHashSet<>();
        // // O(N * logN)
        // for (int x : arr)
        // set.add(x);
        // // O(N)
        // int i = 0;
        // for (Integer x : set) {
        // arr[i] = x;
        // i++;
        // }
        // System.out.println(Arrays.toString(arr));

        // Optimal
        // TC - O(N)
        // SC - O(1)
        int i = 1, j = 1;
        while (i < arr.length && j < arr.length) {
            if (arr[i - 1] != arr[j]) {
                arr[i] = arr[j];
                i++;
            }
            j++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Return : " + i);
    }
}