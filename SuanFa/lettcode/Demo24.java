package lettcode;

//https://leetcode-cn.com/problems/continuous-subarray-sum/solution/lian-xu-de-zi-shu-zu-he-by-leetcode-solu-rdzi/
import java.util.HashMap;
import java.util.Map;

public class Demo24 {
    public static void main(String[] args) {
        Solution24 ss = new Solution24();
        int[] a = {1,2,3,4,5,6,7,8,9};
        int b = 4;
        System.out.println(ss.checkSubarraySum(a,b));
    }
}

class Solution24 {
    public boolean checkSubarraySum(int[] nums, int k) {
        int m = nums.length;
        if (m < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int remainder = 0;
        for (int i = 0; i < m; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
}

