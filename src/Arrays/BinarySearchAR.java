package Arrays;

public class BinarySearchAR {

    public static void main(String[] args) {
int[] ar={-1,0,2,4,6,8};
        //System.out.println(search(ar,6));
        search(ar,6);
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
