import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        int[] distinct = new int[hm.size()];
        int[] freq = new int[hm.size()];
        int l = 0;

        // FIX 1: Standard loop instead of lambda (allows l++)
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            distinct[l] = entry.getKey();
            freq[l] = entry.getValue();
            l++;
        }

        // FIX 2: Double loop for complete bubble sort (instead of a single pass)
        int n = hm.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                // FIX 3: Swap if frequency is higher OR if frequencies are equal but value is smaller
                if (freq[j] > freq[j + 1] || (freq[j] == freq[j + 1] && distinct[j] < distinct[j + 1])) {

                    // Swap frequency
                    int temp = freq[j + 1];
                    freq[j + 1] = freq[j];
                    freq[j] = temp;

                    // Swap corresponding distinct value
                    int temp1 = distinct[j + 1];
                    distinct[j + 1] = distinct[j];
                    distinct[j] = temp1;
                }
            }
        }

        int u = 0;
        for (int x = 0; x < hm.size(); x++) {
            for (int y = freq[x]; y > 0; y--) {
                nums[u] = distinct[x];
                u++;
            }
        }

        return nums;
    }
}