package lettcode;

//https://leetcode-cn.com/problems/contiguous-array/solution/lian-xu-shu-zu-by-leetcode-solution-mvnm/

//连续数组
//前缀和：规定零减一，一加一     两次结果相同中间零一个数相等
//哈希表：前缀和为键，位置为值，前缀和相同，值相减
import java.util.HashMap;
import java.util.Map;

public class Demo25 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1,1,0,0,0,1,1,1,0,};
        Solution25 ss = new Solution25();
        System.out.println(ss.findMaxLenght(arr));
    }
}

class Solution25{
    public int findMaxLenght(int[] nums){
        int maxLength = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        map.put(count,-1);
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(num == 1)
                count++;
            else
                count--;

            if (map.containsKey(count)){
                int preIndex = map.get(count);
                maxLength = Math.max(maxLength,i-preIndex);
            }else {
                map.put(count,i);
            }
        }
        return maxLength;
    }
}

