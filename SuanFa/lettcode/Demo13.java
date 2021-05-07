package lettcode;

//https://leetcode-cn.com/problems/reverse-integer/solution/zheng-shu-fan-zhuan-by-leetcode-solution-bccn/
public class Demo13 {
    public static void main(String[] args) {
        Solution13 ss = new Solution13();
        System.out.println(ss.reverse(12345));
    }
}

class Solution13{
    public int reverse(int x){
        int rev = 0;
        while(x!=0){
            if(rev<Integer.MIN_VALUE / 10 || rev>Integer.MAX_VALUE / 10){
                return 0;
            }
            int digit = x % 10;
            x/=10;
            rev = rev*10+digit;
        }
        return rev;
    }
}
