package lettcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode-cn.com/problems/brick-wall/solution/gong-shui-san-xie-zheng-nan-ze-fan-shi-y-gsri/
public class Demo12 {
    public static void main(String[] args) {
        Solution12 ss = new Solution12();
        int[][] wall = {{1,2,2,1},{3,2,1},{1,3,2},{2,4},{3,1,2},{1,3,1,1}};
        List<List<Integer>> listTest = new ArrayList<List<Integer>>();
        for (int i = 0; i < wall.length; i++) {
            List<Integer> columnList = new ArrayList<Integer>();
            for (int j = 0; j < wall[i].length; j++) {

                columnList.add(j, wall[i][j]);

            }
            listTest.add(i, columnList);
        }
        System.out.println( ss.leastBricks(listTest));
    }
}

class Solution12{
    public int leastBricks(List<List<Integer>> wall){
        Map<Integer,Integer> cnt = new HashMap<Integer,Integer>();
        for (List<Integer> widths:wall){
            int n = widths.size();
            int sum = 0;
            for (int i = 0; i < n-1; i++) {
                sum+=widths.get(i);
                cnt.put(sum,cnt.getOrDefault(sum,0)+1);
                //getOrDefault当Map集合中有这个key(这里是sum)时，就使用这个key值；
                //如果没有就使用默认值defaultValue。

                //put-->key,value
            }
        }
        int maxCnt = 0;
        for (Map.Entry<Integer,Integer> entry:cnt.entrySet()){
            //entrySet是 java中 键-值 对的集合
            //通过getKey（）得到K，getValue得到V。
            maxCnt = Math.max(maxCnt,entry.getValue());
        }
        return wall.size()-maxCnt;
    }
}
