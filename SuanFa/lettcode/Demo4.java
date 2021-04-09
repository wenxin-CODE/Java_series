package lettcode;

public class Demo4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println("最小元素是"+findMin(a));
    }

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else if (nums[pivot] > nums[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return nums[low];
    }
}
