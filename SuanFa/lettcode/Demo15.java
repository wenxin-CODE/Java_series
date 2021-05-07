package lettcode;

public class Demo15 {
    public static void main(String[] args) {
    System.out.println(new Solution15().xorOperation(5,0));
    }
}

class Solution15{

    public int xorOperation(int n,int start){
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= (start + i * 2);
            System.out.println(ans);
        }

        return ans;
    }
}

