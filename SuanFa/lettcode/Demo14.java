package lettcode;

//https://leetcode-cn.com/problems/decode-xored-array/solution/jie-ma-yi-huo-hou-de-shu-zu-by-leetcode-yp0mg/

import java.util.Arrays;

public class Demo14 {
    public static void main(String[] args) {
        int[] arr = {6,2,7,3};
        Solution14 solution14 = new Solution14();
        System.out.println(Arrays.toString(solution14.decode(arr,4)));
    }
}

class Solution14 {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] arr = new int[n];
        arr[0] = first;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }
}

//异或运算具有如下性质：
//
//异或运算满足交换律和结合律；
//
//任意整数和自身做异或运算的结果都等于 00，即 x \oplus x = 0x⊕x=0；
//
//任意整数和 00 做异或运算的结果都等于其自身，即 x \oplus 0 = 0 \oplus x = xx⊕0=0⊕x=x。
//
//encoded[i−1]
//encoded[i−1]⊕arr[i−1]
//arr[i−1]⊕encoded[i−1]
//arr[i−1]⊕encoded[i−1]
//arr[i−1]⊕encoded[i−1]
//​
//
//=arr[i−1]⊕arr[i]
//=arr[i−1]⊕arr[i]⊕arr[i−1]
//=arr[i−1]⊕arr[i−1]⊕arr[i]
//=0⊕arr[i]
//=arr[i]
//​
//

