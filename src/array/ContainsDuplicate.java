package array;

import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};

        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> hash = new HashSet<>();

        for (int x : arr) {
            if (hash.contains(x)) return true;
            hash.add(x);
        }

        return false;
    }
}