import java.util.Arrays;

public class K18SelectionSort {
    public static void main(String[] args) {

        int[] arr = { 0, -1, -18, 7, 56, 9 };
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // find the max item and put it on correct index

            int last = arr.length - i - 1;
            int maxindex = getMaxIndex(arr, 0, last);
            swap(arr, maxindex, last);
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
