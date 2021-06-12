package SuanFa.lettcode;

public class Demo28 {
    public static void main(String[] args) {
        Solution28 ss = new Solution28();
        System.out.println(ss.numSquares(12));
    }
}

class Solution28{
    public int numSquares(int n){
        int[] f = new int[n+1];
        for(int i=1;i<=n;i++){
            int minn = Integer.MAX_VALUE;
            for (int j=1;j*j<=i;j++){
                minn = Math.min(minn,f[i=j*j]);
            }
            f[i] = minn+1;
        }
        return f[n];
    }
}
