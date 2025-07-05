package Arrays;

public class BubSort {
    public static void main(String[] args) {
        int[] ar = {3, 5, 7, 8, 9};
        bubSorted(ar);
        for (int num : ar) {
            System.out.println(num);
        }

    }

    public static void bubSorted(int[] ar) {
        int n = ar.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }


    }
}
