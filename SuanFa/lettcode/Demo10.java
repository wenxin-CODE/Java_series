package lettcode;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        int[] Weight = {1,2,3,4,5,6,7,8,9,10};
        int Day = 5;
        Solution10 ss = new Solution10();
        int min = ss.shipWithinDays(Weight,Day);
        System.out.println("最少要"+min+"的船");
    }
}

class Solution10{
    public int shipWithinDays(int[] weights,int D){
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).max().getAsInt();
        while (left<right){
            int mid = (left+right)/2;
            int need =1,cur=0;
            //need为所需天数，cur为当前重量
            for (int weight: weights){
                if(cur + weight >mid){
                    ++need;
                    cur = 0;
                }
                cur+=weight;
            }
            if(need<=D){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }
}
