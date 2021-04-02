public class Eg2 {
    public static int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                if (A[i][left] == A[i][right]) {
                    A[i][left] ^= 1;
                    A[i][right] ^= 1;
                }
                left++;
                right--;
            }
            if (left == right) {
                A[i][left] ^= 1;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1,0,1,0},{0,1,0,1},{1,0,0,1},{0,1,1,0}};
        int[][] B=new int[4][4];
        B=flipAndInvertImage(A);

        for(int a=0;a< B.length;a++){
            for(int b=0;b<B[a].length;b++){
                System.out.print(B[a][b]+" ");
            }
            System.out.println();
        }
        System.out.println("结果");
        System.out.println(A);
        System.out.println(B);
    }
}
