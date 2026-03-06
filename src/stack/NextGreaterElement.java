package stack;

import java.util.*;

// TC - O(n)
// SC - O(n)
public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i > -1; i--) {
            while (!st.empty() && st.peek() < arr[i])
                st.pop();
            if (st.empty())
                res[i] = -1;
            else
                res[i] = st.peek();
            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }
}