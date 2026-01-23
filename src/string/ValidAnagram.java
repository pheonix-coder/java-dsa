package string;

import java.util.Map;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        System.out.println(validAnagram(s, t));
    }

    public static boolean validAnagram(String s, String t) {
        // Array approach

        // works for ascii characters as just 128 characters

        // TC - O(N)
        // SC - O(1)
        // if (s.length() != t.length()) return false;
        // int[] hash = new int[26];
        // for (char x : s.toCharArray()) {
        // int i = x - 'a';
        // hash[i]++;
        // }
        // for (char x : t.toCharArray()) {
        // int i = x - 'a';
        // hash[i]--;
        // }
        // for (int i : hash)
        // if (i != 0)
        // return false;
        // return true;

        // Map approach

        // this works for unicode characters as there are over 1 million unicode characters.
        // creating array for that is not practical so map.

        // TC - O(N)
        // SC - O(K) K - # distinct characters

        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray())
            map.put(x, map.getOrDefault(x, 0) + 1);
        for (char x : t.toCharArray())
            map.put(x, map.getOrDefault(x, 0) - 1);

        for (int i : map.values())
            if (i != 0)
                return false;
        return true;
    }
}