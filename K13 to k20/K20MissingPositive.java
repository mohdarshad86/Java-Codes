import java.util.Arrays;

public class K20MissingPositive {
    public static void main(String[] args) {

        int[] arr = { 3, 4, -1, 1 };

        System.out.println(MissingPositiveNumber(arr));
        // System.out.println(Arrays.toString(arr));

    }

    // copy from here
    static int MissingPositiveNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctInd = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctInd]) {
                swap(arr, i, correctInd);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
