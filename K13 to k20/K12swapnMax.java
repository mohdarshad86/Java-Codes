import java.util.*;

public class K12swapnMax {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 23, 9, 18, 56 };
        // swap(arr, 0, 4);

        // System.out.println(Arrays.toString(arr));
        // System.out.println(maxRange(arr, 1, 3));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    static int maxRange(int[] arr, int st, int end) {

        // EDGE CASES
        if (end > st) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }

        int maxValue = arr[st];
        for (int i = st; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static void reverse(int arr[]) {
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            swap(arr, st, end);
            st++;
            end--;
        }
    }
}
