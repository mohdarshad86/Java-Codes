import java.util.Arrays;

public class K17BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void BubbleSort(int[] arr) {
        boolean swapped;
        // run the steps n-1 times

        for (int i = 0; i < arr.length - 1; i++) {

            swapped = false;

            // for each step, max items will come at the last resp index
            for (int j = 1; j < arr.length - i; j++) {

                // swap if the item is smaller than prev item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you do not swap for a perticular value of i,
            // it means the array is already sorted
            if (!swapped) {
                break;
            }
        }

    }
}
