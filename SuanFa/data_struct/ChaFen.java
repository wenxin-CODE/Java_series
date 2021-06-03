package data_struct;

import java.util.Arrays;

//差分：数组中第i个减去第i-个存入备用数组的第i个
//应用：区间修改--要给数组第i个到第j个数加n，只需将备用数组第i个加n，第j+1个减n
public class ChaFen {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,10,8,6,4,2};
        int[] b = new int[10];
        for (int i = 1; i < arr.length; i++) {
            b[i] = arr[i] - arr[i-1];
        }
        System.out.println(Arrays.toString(b));
    }
}
