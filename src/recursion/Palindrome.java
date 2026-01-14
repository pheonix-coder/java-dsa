package recursion;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("", "a", "avva", "avv"));

        for (String string : strings) {
            System.out.println(
                    string + " is " + (isPalindrome(string) ? "" : "not ") + "palindrome.");
        }
    }

    public static boolean isPalindrome(String s) {
        if (s.length() < 2)
            return true;

        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));

        return false;
    }
}
