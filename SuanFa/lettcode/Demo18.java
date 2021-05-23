package lettcode;

//最长公共子序列长度
//https://leetcode-cn.com/problems/uncrossed-lines/solution/bu-xiang-jiao-de-xian-by-leetcode-soluti-6tqz/
public class Demo18 {
    public static void main(String[] args) {
        Solution18 ss = new Solution18();
        int a[] = {1,3,7,1,7,5};
        int b[] = {1,9,2,5,1};
        System.out.println("最大连线数位"+ ss.maxUncrossedLines(a,b));
    }
}

class Solution18 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int num1 = nums1[i - 1];
            for (int j = 1; j <= n; j++) {
                int num2 = nums2[j - 1];
                if (num1 == num2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
