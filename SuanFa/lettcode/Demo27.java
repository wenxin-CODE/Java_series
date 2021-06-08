package lettcode;

public class Demo27 {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        Solution27 ss = new Solution27();
        System.out.println(ss.lastStoneWeightII(stones));
    }
}

class Solution27{
    public int lastStoneWeightII(int[] stones){
        int sum = 0;
        for (int weight : stones) {
            sum+=weight;
        }
        int n=stones.length,m=sum/2;
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(j<stones[i]){
                    dp[i+1][j] = dp[i][j];
                }else {
                    dp[i+1][j] = dp[i][j] || dp[i][j-stones[i]];
                }
            }
        }
        for (int i = 0; ; i++) {
            if(dp[n][i]){
                return sum-2*i;
            }
        }
    }
}
