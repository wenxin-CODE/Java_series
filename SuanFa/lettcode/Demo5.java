package lettcode;

public class Demo5 {
    public static void main(String[] args) {
        int a=1235;
        if(isUgly(a)){
            System.out.println(a+"不是丑数");
        }else {
            System.out.println(a+"是丑数");
        }
    }

    public static boolean isUgly(int n){
        if(n<=0){
            return false;
        }

        int[] factors = {2,3,5};
        for(int factor:factors){
            while(n/factor == 0){
                n=n/factor;
            }
        }
        return n==1;
    }
}
