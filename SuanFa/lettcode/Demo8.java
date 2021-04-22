package lettcode;

import java.util.TreeSet;
//https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/

public class Demo8 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,10,11},{4,5,6,12,13},{7,8,9,14,15}};
        int k = 68;
        Solution ss = new Solution();
        System.out.println(ss.maxSumSubmatrix(mat,k));
    }
}

class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int ans = Integer.MIN_VALUE;
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; ++i) { // 枚举上边界
            int[] sum = new int[n];
            for (int j = i; j < m; ++j) { // 枚举下边界
                for (int c = 0; c < n; ++c) {
                    sum[c] += matrix[j][c]; // 更新每列的元素和
                }
                TreeSet<Integer> sumSet = new TreeSet<Integer>();
                sumSet.add(0);
                int s = 0;
                for (int v : sum) {
                    s += v;
                    Integer ceil = sumSet.ceiling(s - k);
                    if (ceil != null) {
                        ans = Math.max(ans, s - ceil);
                    }
                    sumSet.add(s);
                }
            }
        }
        return ans;
    }
}
