package examples;

import java.util.HashMap;
import java.util.Map;

// TC: O(n)
// SC: O(n)
public class ElementFrequencyCounter {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);

        int min = arr[1], max = arr[1];

        System.out.println("Elements frequency: ");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            System.out.println("Frequency of " + element + " = " + frequency);

            if (frequency > map.getOrDefault(max, 0))
                max = element;
            if (frequency < map.getOrDefault(min, 0))
                min = element;
        }

        System.out.println("Minimum frequency element: " + min);
        System.out.println("Maximum frequency element: " + max);
    }
}