package lettcode;

//https://leetcode-cn.com/problems/hamming-distance/solution/yi-ming-ju-chi-by-leetcode-solution-u1w7/
public class Demo22 {
    public static void main(String[] args) {
        Solution22 ss = new Solution22();

    }
}

class Solution22 {
    //直接异或运算，统计为一的位数
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    //我们可以不断地检查 ss 的最低位，如果最低位为 11，那么令计数器加一，然后我们令 ss 整体右移一位，
    // 这样 ss 的最低位将被舍去，原本的次低位就变成了新的最低位。我们重复这个过程直到 s=0s=0 为止
    public int hammingDistance2(int x, int y) {
        int s = x ^ y, res = 0;
        while (s != 0) {
            res += s & 1;
            s >>= 1;
        }
        return res;
    }

    //Brian Kernighan 算法
    //x 和 x-1 进行与运算所得的结果（即 f(x)=x~\&~(x-1)f(x)=x & (x−1)），那么 f(x)f(x) 恰为 xx 删去其二进制表示
    //恰为 xx 删去其二进制表示中最右侧的 11 的结果。
    public int hammingDistance3(int x, int y) {
        int s = x ^ y, res = 0;
        while (s != 0) {
           s &= s-1;
           res++;
        }
        return res;
    }
}

