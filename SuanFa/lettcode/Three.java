package lettcode;

import java.util.HashMap;
import java.util.Map;
//将 answers 中值相同的元素分为一组，对于每一组，计算出兔子的最少数量，然后将所有组的计算结果累加，就是最终的答案
//https://leetcode-cn.com/problems/rabbits-in-forest/solution/sen-lin-zhong-de-tu-zi-by-leetcode-solut-kvla/

class Three {

    public static void main(String[] args) {
        int[] a = {10,10,10};
        int num = numRabbits(a);
        System.out.println("兔子数量为"+num);
    }

    public static int numRabbits(int[] answers) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int y : answers) {
            count.put(y, count.getOrDefault(y, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int y = entry.getKey(), x = entry.getValue();
            ans += (x + y) / (y + 1) * (y + 1);
        }
        return ans;
    }
}