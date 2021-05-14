package lettcode;

//https://leetcode-cn.com/problems/integer-to-roman/solution/zheng-shu-zhuan-luo-ma-shu-zi-by-leetcod-75rs/
public class Demo17 {
    public static void main(String[] args) {
        Solution17 ss = new Solution17();
        System.out.println("the first result is" + ss.intToRoman(147));
        System.out.println("the second result is" + ss.intToRoman2(147));

    }
}

class Solution17{
    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    String thousands[] = {"", "M", "MM", "MMM"};
    String hundreds[]  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String tens[]      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String ones[]      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    //从大到小，逐个筛选
    public String intToRoman(int num){
        StringBuffer roman = new StringBuffer();
        for(int i=0;i<values.length;++i){
            int value = values[i];
            String symbol = symbols[i];
            while(num>=value){
                num-=value;
                roman.append(symbol);
            }
            if(num==0){
                break;
            }
        }
        return roman.toString();
    }

    //按十进制的不同情况进行筛选
    public String intToRoman2(int num){
        return thousands[num/1000] + hundreds[num%1000/100] + tens[num%100/10] + ones[num%10];
    }
}