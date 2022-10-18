import java.util.Arrays;

public class K20CyclicSort {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 1, 5, 2 };

        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void CyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctInd = arr[i] - 1;

            if (arr[i] != arr[correctInd]) {
                swap(arr, i, correctInd);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
