package array;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 3, 4, 5 }, arr2[] = { 2, 3, 4, 4, 5, 6 };

        System.out.print("Union of arr1 and arr2 is : ");

        if (arr1.length == 0)
            System.out.println(Arrays.toString(arr2));
        else if (arr2.length == 0)
            System.out.println(Arrays.toString(arr1));
        else {
            int i = 0, j = 0;
            int last = Integer.MIN_VALUE;

            while (i < arr1.length && j < arr2.length) {
                int val;

                if (arr1[i] < arr2[j]) {
                    val = arr1[i++];
                } else if (arr1[i] > arr2[j]) {
                    val = arr2[j++];
                } else {
                    val = arr1[i];
                    i++;
                    j++;
                }

                if (val != last) {
                    System.out.print(val + ",");
                    last = val;
                }
            }
            while (i < arr1.length) {
                if (arr1[i] != last) {
                    System.out.print(arr1[i] + ",");
                    last = arr1[i];
                }
                i++;
            }

            while (j < arr2.length) {
                if (arr2[j] != last) {
                    System.out.print(arr2[j] + ",");
                    last = arr2[j];
                }
                j++;
            }
            System.out.println();
        }
    }
}