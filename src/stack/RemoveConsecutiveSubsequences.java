package stack;

import java.util.*;

public class RemoveConsecutiveSubsequences {
    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || st.peek() != arr[i])
                st.push(arr[i]);
            else {
                if (i == arr.length - 1 || arr[i] != arr[i + 1])
                    st.pop();
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i > -1; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7 };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(remove(arr)));
    }
}