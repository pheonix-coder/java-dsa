package array;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TopKFrequent {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 }, k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        // Map + Stream (sort)

        // N - length of nums, n - # distinct integers
        // TC - O(N + nlogn)
        // SC - O(n)
        // Map<Integer, Integer> counter = new HashMap<>();
        // for (int x : nums)
        // counter.put(x, counter.getOrDefault(x, 0) + 1);

        // return counter.entrySet().stream()
        // .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        // .limit(k)
        // .map(Map.Entry::getKey)
        // .mapToInt(Integer::intValue)
        // .toArray();

        // Map + BucketSort

        // TC - O(N)
        // SC - O(N)

        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : nums)
            counter.put(x, counter.getOrDefault(x, 0) + 1);

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++)
            buckets.add(new ArrayList<>());

        for (int num : counter.keySet())
            buckets.get(counter.get(num)).add(num);

        int[] res = new int[k];
        int idx = 0;

        for (int i = nums.length; i >= 0 && idx < k; i--) {
            for (int n : buckets.get(i)) {
                res[idx++] = n;
                if (idx == k)
                    break;
            }
        }
        return res;
    }
}