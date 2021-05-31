package lettcode;
//https://leetcode-cn.com/problems/power-of-four/solution/4de-mi-by-leetcode-solution-b3ya/

//如果 nn 是 44 的幂，那么 nn 的二进制表示中有且仅有一个 11，
// 并且这个 11 出现在从低位开始的第偶数个二进制位上（这是因为这个 11 后面必须有偶数个 00）。
public class Demo23 {
    public static void main(String[] args) {
        Solution23 ss = new Solution23();
        System.out.println(ss.isPowerOfFour(16));
    }
}

class Solution23 {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }

    public boolean isPowerOfFour2(int n) {
        return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
    }

}

