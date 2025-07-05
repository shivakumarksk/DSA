package Arrays;

public class RotateAnAr {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;
        rotate(arr, arr.length - 1, k);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void rotate(int[] ar, int k, int l) {
        while (l < k) {
            int temp = ar[k];
            ar[k] = ar[l];
            ar[l] = temp;
            l++;
            k--;
        }
    }
}
