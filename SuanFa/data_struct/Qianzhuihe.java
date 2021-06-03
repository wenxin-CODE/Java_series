package data_struct;

import java.util.Arrays;

//[i,j]的和等于前j个数的和减去前i个数的和

public class Qianzhuihe {
    public static void main(String[] args) {
        int[] num = {1 , 2, 3, 4, 5, 6, 7, 8, 9};
        int n = num.length;

        int[] ak = new int[num.length + 1];
        ak[0] = 0;
        for(int i = 0; i < n; i++){
            ak[i + 1] = ak[i] + num[i];
        }
        System.out.println(Arrays.toString(ak));
    }
}
