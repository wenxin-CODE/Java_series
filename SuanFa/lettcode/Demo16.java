package lettcode;

import java.util.Arrays;

public class Demo16 {
    public static void main(String[] args) {
        Solution16 ss = new Solution16();
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
        int[] arrs = {};
        arrs = ss.xorQueries(arr,queries);
        System.out.println(Arrays.toString(arrs));
    }
}

class Solution16{
    public int[] xorQueries(int[] arr,int[][] queries){
        int n = arr.length;
        int[] xors = new int[n+1];
        for(int i=0;i<n;i++){
            xors[i+1]=xors[i]^arr[i];
        }
        int m=queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = xors[queries[i][0]]^xors[queries[i][1]+1];
        }
        return ans;
    }
}
