package lettcode;

import java.util.HashMap;
import java.util.Map;

public class Demo11 {
    public static void main(String[] args) {
        Solution11 ss = new Solution11();
        int[] array = {1,1,1,2,3,2,3,2,3,4,5,5,5};
        System.out.println(ss.singleNumber(array));
    }
}

class Solution11 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey(), occ = entry.getValue();
            if (occ == 1) {
                ans = num;
                break;
            }
        }
        return ans;
    }
}