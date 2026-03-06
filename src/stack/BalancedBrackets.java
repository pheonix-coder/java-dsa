package stack;

import java.util.*;

public class BalancedBrackets {
    public static int isBalanced(String str) {
        Stack<Character> st = new Stack();
        int toRemove = 0;

        for (Character c : str.toCharArray()) {
            if (c == '(')
                st.push(c);
            else {
                if (!st.empty())
                    st.pop();
                else
                    toRemove++;
            }
        }
        if (!st.empty())
            return st.size();
        else if (toRemove > 0)
            return toRemove;
        else
            return -1;
    }

    public static void main(String[] args) {
        String[] strings = { "(())", "(()(", "())" };

        for (String str : strings) {
            int balanced = isBalanced(str);
            System.out
                    .println(str + " is " + (balanced == -1 ? "" : ("not" + "(" + balanced + ")" + " ")) + "balanced.");
        }
    }
}